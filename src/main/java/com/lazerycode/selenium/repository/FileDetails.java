package com.lazerycode.selenium.repository;

import com.lazerycode.selenium.download.HashType;

import java.net.MalformedURLException;
import java.net.URL;

public class FileDetails {

    private URL fileLocation;
    private HashType hashType;
    private String hash;

    public void setFileLocation(String value) throws MalformedURLException {
        this.fileLocation = new URL(value);
    }

    public URL getFileLocation() {
        return this.fileLocation;
    }

    public void setHash(String value) {
        this.hash = value;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHashType(String value) {
        this.hashType = HashType.valueOf(value.toUpperCase());
    }

    public HashType getHashType() {
        return this.hashType;
    }
}
