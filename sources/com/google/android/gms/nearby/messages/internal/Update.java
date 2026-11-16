package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzng;
import com.google.android.gms.internal.nearby.zznh;
import com.google.android.gms.nearby.messages.Message;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.pv1;
import defpackage.q63;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "UpdateCreator")
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Update> CREATOR = new zzci();
    public final int a;
    public final int b;
    public final Message c;
    public final zze d;
    public final zza e;
    public final zznh f;
    public final byte[] g;

    public static boolean d(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.b == update.b && Objects.equal(this.c, update.c) && Objects.equal(this.d, update.d) && Objects.equal(this.e, update.e) && Objects.equal(this.f, update.f) && Arrays.equals(this.g, update.g);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    public final String toString() {
        byte[] bArr;
        ArrayList arrayList;
        ArrayList arrayList2;
        char c;
        boolean z;
        ArraySet arraySet = new ArraySet(0);
        int i = this.b;
        if (d(i, 1)) {
            arraySet.add("FOUND");
        }
        if (d(i, 2)) {
            arraySet.add("LOST");
        }
        if (d(i, 4)) {
            arraySet.add("DISTANCE");
        }
        if (d(i, 8)) {
            arraySet.add("BLE_SIGNAL");
        }
        if (d(i, 16)) {
            arraySet.add("DEVICE");
        }
        if (d(i, 32)) {
            arraySet.add("BLE_RECORD");
        }
        String string = arraySet.toString();
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.e);
        String strValueOf4 = String.valueOf(this.f);
        ParcelUuid parcelUuid = zzng.h;
        byte[] bArr2 = this.g;
        zzng zzngVar = null;
        if (bArr2 != null) {
            ArrayList arrayList3 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            HashMap map = new HashMap();
            int i2 = -1;
            byte b = -2147483648;
            String str = null;
            int i3 = 0;
            try {
                while (i3 < bArr2.length) {
                    try {
                        int i4 = i3 + 1;
                        int i5 = bArr2[i3] & 255;
                        if (i5 == 0) {
                            arrayList = arrayList3;
                            if (true != arrayList.isEmpty()) {
                                arrayList2 = arrayList;
                            } else {
                                arrayList2 = null;
                            }
                            bArr = bArr2;
                            zzngVar = new zzng(arrayList2, sparseArray, map, i2, b, str, bArr);
                        } else {
                            int i6 = i5 - 1;
                            int i7 = i3 + 2;
                            int i8 = bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            if (i8 != 22) {
                                if (i8 != 255) {
                                    switch (i8) {
                                        case 1:
                                            i2 = bArr2[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                            break;
                                        case 2:
                                        case 3:
                                            zzng.a(bArr2, i7, i6, 2, arrayList3);
                                            break;
                                        case 4:
                                        case 5:
                                            zzng.a(bArr2, i7, i6, 4, arrayList3);
                                            break;
                                        case 6:
                                        case 7:
                                            zzng.a(bArr2, i7, i6, 16, arrayList3);
                                            break;
                                        case 8:
                                        case 9:
                                            byte[] bArr3 = new byte[i6];
                                            System.arraycopy(bArr2, i7, bArr3, 0, i6);
                                            str = new String(bArr3);
                                            break;
                                        case 10:
                                            b = bArr2[i7];
                                            break;
                                        default:
                                            break;
                                    }
                                } else {
                                    int i9 = bArr2[i3 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    int i10 = 255 & bArr2[i7];
                                    int i11 = i5 - 3;
                                    byte[] bArr4 = new byte[i11];
                                    System.arraycopy(bArr2, i3 + 4, bArr4, 0, i11);
                                    sparseArray.put((i9 << 8) + i10, bArr4);
                                }
                                c = 2;
                                z = false;
                            } else {
                                arrayList3 = arrayList3;
                                c = 2;
                                byte[] bArr5 = new byte[2];
                                z = false;
                                System.arraycopy(bArr2, i7, bArr5, 0, 2);
                                ParcelUuid parcelUuidB = zzng.b(bArr5);
                                int i12 = i5 - 3;
                                byte[] bArr6 = new byte[i12];
                                System.arraycopy(bArr2, i3 + 4, bArr6, 0, i12);
                                map.put(parcelUuidB, bArr6);
                            }
                            i3 = i7 + i6;
                            arrayList3 = arrayList3;
                        }
                    } catch (Exception e) {
                        e = e;
                        bArr = bArr2;
                    }
                }
                zzngVar = new zzng(arrayList2, sparseArray, map, i2, b, str, bArr);
            } catch (Exception e2) {
                e = e2;
                Log.w("BleRecord", "Unable to parse scan record: ".concat(String.valueOf(Arrays.toString(bArr))), e);
            }
            arrayList = arrayList3;
            if (true != arrayList.isEmpty()) {
                arrayList2 = arrayList;
            } else {
                arrayList2 = null;
            }
            bArr = bArr2;
        }
        String strValueOf5 = String.valueOf(zzngVar);
        StringBuilder sbR = pv1.r("Update{types=", string, ", message=", strValueOf, ", distance=");
        q63.y(sbR, strValueOf2, ", bleSignal=", strValueOf3, ", device=");
        return pv1.p(sbR, strValueOf4, ", bleRecord=", strValueOf5, "}");
    }

    public Update(int i, int i2, Message message, zze zzeVar, zza zzaVar, zznh zznhVar, byte[] bArr) {
        this.a = i;
        boolean zD = d(i2, 2);
        this.b = true == zD ? 2 : i2;
        this.c = message;
        this.d = true == zD ? null : zzeVar;
        this.e = true == zD ? null : zzaVar;
        this.f = true == zD ? null : zznhVar;
        this.g = true == zD ? null : bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
