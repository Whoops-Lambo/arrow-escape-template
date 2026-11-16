package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Payload;
import defpackage.d;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzmd {
    public static File a;

    public static Payload a(Context context, zzmb zzmbVar) {
        long j = zzmbVar.a;
        int i = zzmbVar.b;
        if (i == 1) {
            zzlx zzlxVar = zzmbVar.k;
            byte[] bArr = zzlxVar != null ? zzlxVar.a : zzmbVar.c;
            if (bArr != null) {
                return new Payload(j, 1, bArr, null, null);
            }
            d.w("Payload bytes cannot be null if type is BYTES.");
            return null;
        }
        if (i != 2) {
            if (i != 3) {
                Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", Long.valueOf(j), Integer.valueOf(zzmbVar.b)));
                return null;
            }
            ParcelFileDescriptor parcelFileDescriptor = zzmbVar.d;
            if (parcelFileDescriptor != null) {
                Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
                return new Payload(j, 3, null, null, new Payload.Stream());
            }
            d.w("Data ParcelFileDescriptor cannot be null for type STREAM");
            return null;
        }
        String str = zzmbVar.e;
        Uri uri = zzmbVar.h;
        if (str == null || uri == null) {
            ParcelFileDescriptor parcelFileDescriptor2 = zzmbVar.d;
            if (parcelFileDescriptor2 != null) {
                return new Payload(j, 2, null, new Payload.File(null, (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor2, "Cannot create Payload.File from null ParcelFileDescriptor."), parcelFileDescriptor2.getStatSize()), null);
            }
            d.w("Data ParcelFileDescriptor cannot be null for type FILE");
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                return new Payload(j, 2, null, Payload.File.a(new File(str), parcelFileDescriptorOpenFileDescriptor, zzmbVar.f, uri), null);
            }
            Log.w("NearbyConnections", String.format("Failed to get ParcelFileDescriptor for %s", uri));
            return null;
        } catch (FileNotFoundException e) {
            Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri, str), e);
            return null;
        } catch (SecurityException e2) {
            Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri, str), e2);
            return null;
        }
    }
}
