package com.github.jtama.crazy.dop;

import java.util.Objects;

public record SuitCard(Color color, int index, Face face) implements PlayingCard {
    public SuitCard {
        if (color == null)
            throw new IllegalArgumentException("Color must not be null.");
        if (index < 1)
            throw new IndexOutOfBoundsException("Index must be positive.");
        if (index > 15)
            throw new IndexOutOfBoundsException("Index must be lesser than 15.");
        if (index > 10 && face == null)
            throw new IllegalArgumentException("Face must not be null for index greater than 10.");
        if (index < 11 && face != null)
            throw new IllegalArgumentException("Face must be null for index lesser than 11.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SuitCard)) return false;
        SuitCard suitCard = (SuitCard) o;
        return color == suitCard.color && Objects.equals(index, suitCard.index) && face == suitCard.face;
    }


}
