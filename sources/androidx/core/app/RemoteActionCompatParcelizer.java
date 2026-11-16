package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RestrictTo
public class RemoteActionCompatParcelizer {
    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.q(false, false);
        IconCompat iconCompat = remoteActionCompat.a;
        versionedParcel.p(1);
        versionedParcel.y(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        versionedParcel.p(2);
        versionedParcel.t(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        versionedParcel.p(3);
        versionedParcel.t(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        versionedParcel.p(4);
        versionedParcel.w(pendingIntent);
        boolean z = remoteActionCompat.e;
        versionedParcel.p(5);
        versionedParcel.r(z);
        boolean z2 = remoteActionCompat.f;
        versionedParcel.p(6);
        versionedParcel.r(z2);
    }

    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        VersionedParcelable versionedParcelableO = remoteActionCompat.a;
        if (versionedParcel.j(1)) {
            versionedParcelableO = versionedParcel.o();
        }
        remoteActionCompat.a = (IconCompat) versionedParcelableO;
        CharSequence charSequenceI = remoteActionCompat.b;
        if (versionedParcel.j(2)) {
            charSequenceI = versionedParcel.i();
        }
        remoteActionCompat.b = charSequenceI;
        CharSequence charSequenceI2 = remoteActionCompat.c;
        if (versionedParcel.j(3)) {
            charSequenceI2 = versionedParcel.i();
        }
        remoteActionCompat.c = charSequenceI2;
        Parcelable parcelableM = remoteActionCompat.d;
        if (versionedParcel.j(4)) {
            parcelableM = versionedParcel.m();
        }
        remoteActionCompat.d = (PendingIntent) parcelableM;
        boolean zG = remoteActionCompat.e;
        if (versionedParcel.j(5)) {
            zG = versionedParcel.g();
        }
        remoteActionCompat.e = zG;
        boolean zG2 = remoteActionCompat.f;
        if (versionedParcel.j(6)) {
            zG2 = versionedParcel.g();
        }
        remoteActionCompat.f = zG2;
        return remoteActionCompat;
    }
}
