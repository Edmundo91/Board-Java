package com.Board_Java.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import com.Board_Java.DTO.CardDetailsDTO;
import com.Board_Java.persistence.dao.CardDAO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }

}
