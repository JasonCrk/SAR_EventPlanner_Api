package com.SAR.ReservationsSAR.context.reservation.application.controllers;

import com.SAR.ReservationsSAR.context.reservation.application.requests.MakeReservationRequest;
import com.SAR.ReservationsSAR.context.user.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

public interface ReservationController {
    ResponseEntity<?> getAllPendingReservations(@RequestAttribute("user") User user);

    ResponseEntity<?> makeReservation(
            @RequestAttribute("user") User user,
            @RequestBody MakeReservationRequest request
    );

    ResponseEntity<?> cancelReservation(
            @PathVariable("id") UUID reservationId,
            @RequestAttribute("user") User user
    );
}
