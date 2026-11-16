package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import defpackage.g25;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "ParcelByteArrayCreator")
@SafeParcelable.Reserved({1000})
public final class zzlx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlx> CREATOR = new g25();
    public byte[] a = new byte[0];
    public ParcelFileDescriptor b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlx) {
            return Arrays.equals(this.a, ((zzlx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099 A[PHI: r7
  0x0099: PHI (r7v4 java.io.DataOutputStream) = (r7v3 java.io.DataOutputStream), (r7v5 java.io.DataOutputStream) binds: [B:42:0x00b2, B:37:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0061: MOVE (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:99), block:B:20:0x0061 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        Closeable closeable;
        DataOutputStream dataOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        byte[] bArr = this.a;
        Closeable closeable2 = null;
        if (bArr != null) {
            try {
                if (this.b == null) {
                    try {
                        try {
                            File file = zzmd.a;
                            if (file == null) {
                                throw new IllegalStateException("Must set temp dir before writing this object to a parcel");
                            }
                            try {
                                File fileCreateTempFile = File.createTempFile("teleporter" + SystemClock.elapsedRealtime(), ".tmp", file);
                                try {
                                    FileOutputStream fileOutputStreamFileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(fileCreateTempFile);
                                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                                    fileCreateTempFile.delete();
                                    Pair pairCreate = Pair.create(fileOutputStreamFileOutputStreamCtor, parcelFileDescriptorOpen);
                                    dataOutputStream = new DataOutputStream(new BufferedOutputStream((OutputStream) pairCreate.first));
                                    try {
                                        dataOutputStream.writeInt(bArr.length);
                                        dataOutputStream.write(bArr);
                                        parcelFileDescriptor = (ParcelFileDescriptor) pairCreate.second;
                                        d(dataOutputStream);
                                    } catch (IOException e) {
                                        e = e;
                                        Log.e("ParcelByteArray", "Could not write into unlinked file. " + e.toString());
                                        if (dataOutputStream != null) {
                                            d(dataOutputStream);
                                        }
                                        parcelFileDescriptor = null;
                                    } catch (IllegalStateException e2) {
                                        e = e2;
                                        Log.e("ParcelByteArray", "Could not create unlinked file. " + e.toString());
                                        if (dataOutputStream != null) {
                                            d(dataOutputStream);
                                        }
                                        parcelFileDescriptor = null;
                                    }
                                    this.b = parcelFileDescriptor;
                                } catch (FileNotFoundException e3) {
                                    throw new IllegalStateException("Temporary file is somehow already deleted", e3);
                                }
                            } catch (IOException e4) {
                                throw new IllegalStateException("Could not create temporary file", e4);
                            }
                        } catch (IllegalStateException e5) {
                            e = e5;
                            dataOutputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            if (closeable2 != null) {
                                d(closeable2);
                            }
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        dataOutputStream = null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
            }
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.b, i | 1, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        this.b = null;
    }

    private zzlx() {
    }

    public static void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }
}
