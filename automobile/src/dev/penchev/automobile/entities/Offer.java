package dev.penchev.automobile.entities;

import dev.penchev.automobile.entities.iam.User;
import dev.penchev.automobile.entities.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

public class Offer {
  protected UUID id;
  protected String title;
  protected String descritpion;
  protected Vehicle veichle;
  protected boolean isArchived;
  protected float price;

  protected User createdBy;
  protected User purchasedBy;

  protected LocalDateTime createdAt;
  protected LocalDateTime updatedAt;
  protected LocalDateTime purchasedAt;
}
