package com.omar.model.database.implementation.transaction;

import java.util.Optional;

public class ReadTransaction extends TransactionImpl {
  @Override
  public Optional<Object> implement() {
    return Optional.empty();
  }
}
