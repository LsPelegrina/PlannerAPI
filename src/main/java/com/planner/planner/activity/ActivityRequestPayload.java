package com.planner.planner.activity;

import com.planner.planner.trip.Trip;

public record ActivityRequestPayload(String title, String occurs_at, Trip trip) {
}
