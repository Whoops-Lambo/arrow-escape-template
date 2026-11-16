package com.safedk.android.analytics.brandsafety.creatives;

/* JADX INFO: loaded from: classes6.dex */
public class i {
    private static final String b = "VastAdTagUri";
    protected final String a;

    public i(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return obj.equals(this.a);
        }
        return (this.a == null || obj == null || !this.a.equals(obj.toString())) ? false : true;
    }

    public int hashCode() {
        int iIndexOf;
        if (this.a != null && (iIndexOf = this.a.indexOf("//")) >= 0) {
            int i = iIndexOf + 2;
            int iIndexOf2 = this.a.indexOf("/", i);
            if (iIndexOf2 < 0) {
                iIndexOf2 = this.a.length();
            }
            return this.a.substring(i, iIndexOf2).hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.a;
    }
}
