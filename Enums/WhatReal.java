package Enums;

public enum WhatReal {
    REAl("в реальности"), UNREAL("в воображении");

    private final String whatReal;

    WhatReal(String s) { this.whatReal = s; }

    @Override
    public String toString() {
        return this.whatReal;
    }
}
