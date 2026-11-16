package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import defpackage.d;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class IconCompatParcelizer {
    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.q(true, true);
        boolean zF = versionedParcel.f();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                if (zF) {
                    d.r("Can't serialize Icon created with IconCompat#createFromIcon");
                    return;
                }
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                Object obj = iconCompat.b;
                if (!zF) {
                    iconCompat.d = (Parcelable) obj;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    iconCompat.c = byteArrayOutputStream.toByteArray();
                }
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            versionedParcel.v(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            versionedParcel.p(2);
            versionedParcel.s(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            versionedParcel.p(3);
            versionedParcel.w(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            versionedParcel.v(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            versionedParcel.v(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            versionedParcel.p(6);
            versionedParcel.w(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            versionedParcel.p(7);
            versionedParcel.x(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            versionedParcel.p(8);
            versionedParcel.x(str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = versionedParcel.l(iconCompat.a, 1);
        byte[] bArrH = iconCompat.c;
        if (versionedParcel.j(2)) {
            bArrH = versionedParcel.h();
        }
        iconCompat.c = bArrH;
        Parcelable parcelableM = iconCompat.d;
        if (versionedParcel.j(3)) {
            parcelableM = versionedParcel.m();
        }
        iconCompat.d = parcelableM;
        iconCompat.e = versionedParcel.l(iconCompat.e, 4);
        iconCompat.f = versionedParcel.l(iconCompat.f, 5);
        Parcelable parcelableM2 = iconCompat.g;
        if (versionedParcel.j(6)) {
            parcelableM2 = versionedParcel.m();
        }
        iconCompat.g = (ColorStateList) parcelableM2;
        String strN = iconCompat.i;
        if (versionedParcel.j(7)) {
            strN = versionedParcel.n();
        }
        iconCompat.i = strN;
        String strN2 = iconCompat.j;
        if (versionedParcel.j(8)) {
            strN2 = versionedParcel.n();
        }
        iconCompat.j = strN2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                d.r("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.c;
                iconCompat.b = bArr;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }
}
