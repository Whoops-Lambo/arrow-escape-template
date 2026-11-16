package com.facebook.gamingservices;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/gamingservices/Tournament;", "", "CREATOR", "com/facebook/gamingservices/w", "facebook-gamingservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Tournament implements Parcelable {

    @NotNull
    public static final w CREATOR = new w();
    public final String a;
    public final String b;
    public final String c;
    public String d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void a(ZonedDateTime zonedDateTime) {
        if (Build.VERSION.SDK_INT < 26 || zonedDateTime == null) {
            return;
        }
        DateTimeFormatter unused = DateTimeFormatter.ISO_DATE_TIME;
        this.d = zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        a(zonedDateTime);
    }

    public Tournament(Parcel parcel) {
        String string = parcel.toString();
        String string2 = parcel.toString();
        String string3 = parcel.toString();
        String string4 = parcel.toString();
        string.getClass();
        this.a = string;
        this.d = string2;
        this.b = string3;
        this.c = string4;
        ZonedDateTime zonedDateTime = null;
        if (string2 != null && Build.VERSION.SDK_INT >= 26) {
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
            dateTimeFormatterOfPattern.getClass();
            zonedDateTime = ZonedDateTime.parse(string2, dateTimeFormatterOfPattern);
        }
        a(zonedDateTime);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.d);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
