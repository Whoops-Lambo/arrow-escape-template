package com.facebook.gamingservices;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h50;
import defpackage.pv1;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig;", "", "CREATOR", "com/facebook/h", "com/facebook/gamingservices/x", "facebook-gamingservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TournamentConfig implements Parcelable {

    @NotNull
    public static final x CREATOR = new x();
    public final String a;
    public final int b;
    public final int c;
    public final Instant d;
    public final String e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TournamentConfig(Parcel parcel) {
        Instant instantFrom;
        int i;
        String string;
        ZonedDateTime zonedDateTime;
        String str;
        this.a = parcel.readString();
        int[] iArrE = h50.E(2);
        int length = iArrE.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            instantFrom = null;
            zonedDateTime = null;
            instantFrom = null;
            if (i3 < length) {
                i = iArrE[i3];
                if (i != 1) {
                    if (i == 2) {
                        str = "HigherIsBetter";
                    } else {
                        throw null;
                    }
                } else {
                    str = "LowerIsBetter";
                }
                if (str.equals(parcel.readString())) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i = 0;
                break;
            }
        }
        this.b = i;
        for (int i4 : h50.E(2)) {
            if (pv1.y(i4).equals(parcel.readString())) {
                i2 = i4;
                break;
            }
        }
        this.c = i2;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && (string = parcel.readString()) != null) {
            if (i5 >= 26) {
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
                dateTimeFormatterOfPattern.getClass();
                zonedDateTime = ZonedDateTime.parse(string, dateTimeFormatterOfPattern);
            }
            instantFrom = Instant.from(androidx.core.app.b.j(zonedDateTime));
        }
        this.d = instantFrom;
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.getClass();
        String str2 = "null";
        int i2 = this.b;
        if (i2 != 1) {
            if (i2 != 2) {
                str = "null";
            } else {
                str = "HigherIsBetter";
            }
        } else {
            str = "LowerIsBetter";
        }
        parcel.writeString(str);
        int i3 = this.c;
        if (i3 != 1) {
            if (i3 == 2) {
                str2 = "TIME";
            }
        } else {
            str2 = "NUMERIC";
        }
        parcel.writeString(str2);
        parcel.writeString(String.valueOf(this.d));
        parcel.writeString(this.a);
        parcel.writeString(this.e);
    }

    public TournamentConfig(com.facebook.h hVar) {
        this.a = hVar.a;
        this.b = hVar.b;
        this.c = hVar.c;
        this.d = (Instant) hVar.e;
        this.e = hVar.d;
    }
}
