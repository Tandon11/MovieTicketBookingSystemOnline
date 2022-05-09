import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  httpOptions = {
    headers :new HttpHeaders({
      'Content-Type':'application/json'
    })
  }

  constructor(private http: HttpClient) { }

  addBooking(bookingDetails: any) {
    return this.http.post('http://localhost:8090/booking/add', bookingDetails, this.httpOptions);
  }
}
