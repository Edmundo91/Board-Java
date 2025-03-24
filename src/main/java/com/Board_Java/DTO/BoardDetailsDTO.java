package com.Board_Java.DTO;

import java.util.List;

public record BoardDetailsDTO(Long id,
        String name,
        List<BoardColumnDTO> columns) {
}
