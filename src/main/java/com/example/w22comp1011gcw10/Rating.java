package com.example.w22comp1011gcw10;

import com.google.gson.annotations.SerializedName;

public class Rating {
    @SerializedName("Source")
    private String source;

    @SerializedName("Value")
    private String value;

    public String getSource() {
        return source;
    }

    public String getValue() {
        return value;
    }

    public String toString()
    {
        return String.format("%s (%s)", source, value);
    }
}
