package com.tiktok.appevents;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ReferrerInfo {
    private String googleInstallReferrer;
    private long gpReferrerClickTs;
    private long gpReferrerInstallTs;

    public String getGoogleInstallReferrer() {
        return this.googleInstallReferrer;
    }

    public long getGpReferrerClickTs() {
        return this.gpReferrerClickTs;
    }

    public long getGpReferrerInstallTs() {
        return this.gpReferrerInstallTs;
    }

    public void setGoogleInstallReferrer(String str) {
        this.googleInstallReferrer = str;
    }

    public void setGpReferrerClickTs(long j) {
        this.gpReferrerClickTs = j;
    }

    public void setGpReferrerInstallTs(long j) {
        this.gpReferrerInstallTs = j;
    }

    public ReferrerInfo(String str, long j, long j2) {
        this.googleInstallReferrer = str;
        this.gpReferrerInstallTs = j;
        this.gpReferrerClickTs = j2;
    }
}
