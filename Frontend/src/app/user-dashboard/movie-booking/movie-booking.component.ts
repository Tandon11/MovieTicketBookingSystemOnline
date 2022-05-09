import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {LocationService} from "../../Services/location.service";
import {Location} from "../../Models/location.model";
import {ActivatedRoute, Router} from "@angular/router";
import {Theatre} from "../../Models/theatre.model";
import {TheatreService} from "../../Services/theatre.service";
import {ShowService} from "../../Services/show.service";
import {Show} from "../../Models/show.model";
import {SeatService} from "../../Services/seat.service";
import {Seat} from "../../Models/seat.model";
import {BookingService} from "../../Services/booking.service";

@Component({
  selector: 'app-movie-booking',
  templateUrl: './movie-booking.component.html',
  styleUrls: ['./movie-booking.component.css']
})

export class MovieBookingComponent implements OnInit {

  bookingDetails = {
    email: '',
    MovieId: 0,
    LocationId: 0,
    TheatreId: 0,
    ShowId: 0,
    seatId: '',
    Count: 0
  }

  temp: any;
  locations: Location[] = [];
  theatres: Theatre[] = [];
  shows: Show[] = [];
  seats: Seat[] = [];

  selectedSeats: any = [];
  seatStatus: boolean[] = [];
  seatCount = 0;

  constructor(private locationService: LocationService, private route: ActivatedRoute,
              private theatreService: TheatreService, private showService: ShowService,
              private seatService: SeatService, private router: Router, private bookingService: BookingService) { }

  ngOnInit(): void {
    this.bookingDetails.MovieId = this.route.snapshot.params['movieId'];
    this.loadLocations();
    this.getEmail();
    this.setEmail();
  }

  loadLocations() {
    console.log(this.bookingDetails.MovieId);
    this.locationService.getLocation().subscribe(
        response => this.locations = response
    );
  }

  getEmail() {
    this.temp = JSON.parse(sessionStorage.getItem('email') || '{}');
  }

  setEmail() {
    this.bookingDetails.email = this.temp;
    console.log(this.bookingDetails.email);
  }

  onSubmit() {
    console.log(this.bookingDetails.email);
    console.log(this.bookingDetails.MovieId);
    console.log(this.bookingDetails.LocationId);
    console.log(this.bookingDetails.TheatreId);
    console.log(this.bookingDetails.ShowId);
    console.log(this.bookingDetails.seatId);
  }

  getTheatreByLocidAndMovid() {
    console.log("I am Called")
    this.theatreService.getTheatreById(this.bookingDetails.LocationId, this.bookingDetails.MovieId).subscribe(
        response => {
          this.theatres = response
          console.log("Response: ",response)
        }
    );
  }

  getShowsById() {
    this.showService.getShowById(this.bookingDetails.TheatreId, this.bookingDetails.MovieId, this.bookingDetails.LocationId).subscribe(
        response => {
          this.shows = response
          console.log(response)
        }
    );
  }

  getSeatsById() {
    this.seatService.getSeatsById(this.bookingDetails.TheatreId, this.bookingDetails.MovieId, this.bookingDetails.LocationId, this.bookingDetails.ShowId).subscribe(
        response => {
          console.log(response);
          this.seats = response

          console.log(this.seats.length);

          //Assigns Booked(true) or Not Booked(false) to the seatStatus array
          for(let i = 0; i<this.seats.length; i++){
            if(this.seats[i].status == 1)
              this.seatStatus[i] = true;
            else
              this.seatStatus[i] = false;
          }
        }
    );
  }

  onCheckBoxClick(event: any, seatId: any) {
    if(event.target.checked) {
      this.selectedSeats.push(seatId);
      this.seatCount += 1;
    } else {
      let index = this.selectedSeats.indexOf(seatId);
      if (index > -1) {
        this.selectedSeats.splice(index, 1);
        this.seatCount -= 1;
      }
    }
    this.bookingDetails.seatId = this.selectedSeats.map(String).toString();
    this.bookingDetails.Count = this.seatCount;
    console.log(this.bookingDetails.seatId);
    // console.log(typeof(this.bookingDetails.seatId[0]));
    // console.log(typeof(this.bookingDetails.count));
  }

  updateSeatStatus() {
    console.log("Selected Seats :",this.selectedSeats);
      this.seatService.updateSeatById(this.selectedSeats).subscribe(
          response => {
            if(response)
              console.log("Seats Updated Successfully");
            else
              console.log("Something Went Wrong");
            // this.router.navigate(['/dashboard/Booking']);
            console.log(this.bookingDetails);
            this.bookingService.addBooking(this.bookingDetails).subscribe(
                response=> console.log("Booking called")
            );
          }
      );}

}
