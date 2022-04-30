import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {LocationService} from "../../Services/location.service";
import {Location} from "../../Models/location.model";
import {ActivatedRoute} from "@angular/router";
import {Theatre} from "../../Models/theatre.model";
import {TheatreService} from "../../Services/theatre.service";
import {ShowService} from "../../Services/show.service";
import {Show} from "../../Models/show.model";
import {SeatService} from "../../Services/seat.service";
import {Seat} from "../../Models/seat.model";

@Component({
  selector: 'app-movie-booking',
  templateUrl: './movie-booking.component.html',
  styleUrls: ['./movie-booking.component.css']
})
export class MovieBookingComponent implements OnInit {

  bookingDetails = {
    email: '',
    movieId: '',
    locationId: '',
    theatreId: '',
    showId: '',
    seatId: '',
  }

  temp: any;
  locations: Location[] = [];
  theatres: Theatre[] = [];
  shows: Show[] = [];
  seats: Seat[] = [];

  constructor(private locationService: LocationService, private route: ActivatedRoute,
              private theatreService: TheatreService, private showService: ShowService,
              private seatService: SeatService) { }

  ngOnInit(): void {
    this.bookingDetails.movieId = this.route.snapshot.params['movieId'];
    this.loadLocations();
    this.getEmail();
    this.setEmail();
  }

  loadLocations() {
    console.log(this.bookingDetails.movieId);
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
    console.log(this.bookingDetails.movieId);
    console.log(this.bookingDetails.locationId);
    console.log(this.bookingDetails.theatreId);
    console.log(this.bookingDetails.showId);
    console.log(this.bookingDetails.seatId);
  }

  getTheatreByLocidAndMovid() {
    console.log("I am Called")
    this.theatreService.getTheatreById(this.bookingDetails.locationId, this.bookingDetails.movieId).subscribe(
        response => {
          this.theatres = response
          console.log("Response: ",response)
        }
    );
  }

  getShowsById() {
    this.showService.getShowById(this.bookingDetails.theatreId, this.bookingDetails.movieId, this.bookingDetails.locationId).subscribe(
        response => {
          this.shows = response
          console.log(response)
        }
    );
  }

  getSeatsById() {
    this.seatService.getSeatsById(this.bookingDetails.theatreId, this.bookingDetails.movieId, this.bookingDetails.locationId).subscribe(
        response => {
          console.log(response);
          this.seats = response
        }
    );
  }

}
