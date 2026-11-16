package com.tiktok.appevents.edp;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class Sensig {
    public String regexList;
    public int version;

    public String getRegexList() {
        return this.regexList;
    }

    public int getVersion() {
        return this.version;
    }

    public void setRegexList(String str) {
        this.regexList = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public Sensig(int i, String str) {
        this.version = i;
        this.regexList = str;
        if (TextUtils.isEmpty(str)) {
            this.regexList = EDPConfig.DEFAULT_SENSIG_FILTERING_REGEX_LIST;
        }
    }
}
