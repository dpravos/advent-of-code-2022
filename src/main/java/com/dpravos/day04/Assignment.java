package com.dpravos.day04;

public record Assignment(int left, int right) {
    public boolean contains(Assignment that) {
        return left <= that.left && right >= that.right;
    }

    public boolean overlaps(Assignment that) {
        return that.left >= left && that.left <= right
               || that.right >= left && that.right <= right;
    }
}
