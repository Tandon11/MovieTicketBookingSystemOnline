import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {TheatreService} from "../../Services/theatre.service";
import {LocationService} from "../../Services/location.service";
import {Theatre} from "../../Models/theatre.model";
import {Location} from "../../Models/location.model";
import {Movie} from "../../Models/movie.model";
import {MovieService} from "../../Services/movie.service";
import {SeatService} from "../../Services/seat.service";

@Component({
  selector: 'app-add-seat',
  templateUrl: './add-seat.component.html',
  styleUrls: ['./add-seat.component.css']
})
export class AddSeatComponent implements OnInit {

  theatres: Theatre[] = [];
  locations: Location[] = [];
  movies: Movie[] = [];

  locId: any;
  movId: any;

  constructor(private theatreService: TheatreService, private locationService: LocationService,
              private movieService: MovieService, private seatService: SeatService) { }

  form = new FormGroup({
    movieId: new FormControl('', Validators.required),
    theatreId: new FormControl('', Validators.required),
    locationId: new FormControl('', Validators.required),
    seat_type: new FormControl('', Validators.required),
    cost: new FormControl('', Validators.required)
  })

  ngOnInit(): void {
    this.loadMovies();
    this.loadLocations();
  }

  onSubmit() {
    this.seatService.addSeat(JSON.stringify(this.form.value)).subscribe(
        response => {
          if (response)
            alert("Seat Added");
          else
            alert("Something Went Wrong");
          location.reload();
        });
  }

  loadMovies() {
    this.movieService.getMovies().subscribe(
        response => this.movies = response
    );
  }

  loadLocations() {
    this.locationService.getLocation().subscribe(
        response => this.locations = response
    );
  }

  setLocid(event: any) {
    if (event.target.value)
      this.locId = event.target.value;
  }

  setMovid(event: any) {
    if (event.target.value)
      this.movId = event.target.value;
  }

  getTheatreByLocidAndMovid() {
    this.theatreService.getTheatreById(this.locId, this.movId).subscribe(
        response => this.theatres = response
    );
  }

}
