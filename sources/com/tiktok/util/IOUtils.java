package com.tiktok.util;

import android.os.Parcel;
import java.io.Closeable;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class IOUtils {
    public static void close(Closeable... closeableArr) {
        if (closeableArr != null) {
            try {
                for (Closeable closeable : closeableArr) {
                    try {
                        closeable.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static void close(Parcel... parcelArr) {
        if (parcelArr != null) {
            try {
                for (Parcel parcel : parcelArr) {
                    try {
                        parcel.recycle();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static void close(HttpURLConnection... httpURLConnectionArr) {
        if (httpURLConnectionArr != null) {
            try {
                for (HttpURLConnection httpURLConnection : httpURLConnectionArr) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
