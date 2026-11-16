package com.google.android.gms.internal.nearby;

import android.os.ParcelUuid;
import android.util.SparseArray;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.Hex;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import com.ironsource.G5;
import defpackage.d;
import defpackage.pv1;
import defpackage.q63;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzng {
    public static final ParcelUuid h = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    public final int a;
    public final List b;
    public final SparseArray c;
    public final HashMap d;
    public final int e;
    public final String f;
    public final byte[] g;

    public static ParcelUuid b(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            d.r(pv1.k(length, "uuidBytes length invalid - "));
            return null;
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j = ((long) (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + ((long) ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
        } else {
            j = ((long) ((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24)) + ((long) (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + ((long) ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) + ((long) ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16));
        }
        ParcelUuid parcelUuid = h;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    public static void a(byte[] bArr, int i, int i2, int i3, ArrayList arrayList) {
        while (i2 > 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            arrayList.add(b(bArr2));
            i2 -= i3;
            i += i3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzng) {
            return Arrays.equals(this.g, ((zzng) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g);
    }

    public final String toString() {
        String string;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder();
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        int i = 0;
        String string2 = JsonUtils.EMPTY_JSON;
        if (size <= 0) {
            string = JsonUtils.EMPTY_JSON;
        } else {
            sb.append('{');
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                int iKeyAt = sparseArray.keyAt(i2);
                byte[] bArr = (byte[]) sparseArray.valueAt(i2);
                sb.append(iKeyAt);
                sb.append(G5.U);
                sb.append(bArr == null ? null : Hex.bytesToStringUppercase(bArr));
            }
            sb.append('}');
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        HashMap map = this.d;
        if (!map.keySet().isEmpty()) {
            sb2.append('{');
            for (Map.Entry entry : map.entrySet()) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append(G5.U);
                byte[] bArr2 = (byte[]) entry.getValue();
                sb2.append(bArr2 == null ? null : Hex.bytesToStringUppercase(bArr2));
                i++;
            }
            sb2.append('}');
            string2 = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("BleRecord [mAdvertiseFlags=");
        sb3.append(this.a);
        sb3.append(", mServiceUuids=");
        sb3.append(strValueOf);
        sb3.append(", mManufacturerSpecificData=");
        q63.y(sb3, string, ", mServiceData=", string2, ", mTxPowerLevel=");
        sb3.append(this.e);
        sb3.append(", mDeviceName=");
        sb3.append(this.f);
        sb3.append(C4664b4.j.e);
        return sb3.toString();
    }

    public zzng(ArrayList arrayList, SparseArray sparseArray, HashMap map, int i, int i2, String str, byte[] bArr) {
        this.b = arrayList;
        this.c = sparseArray;
        this.d = map;
        this.f = str;
        this.a = i;
        this.e = i2;
        this.g = bArr;
    }
}
