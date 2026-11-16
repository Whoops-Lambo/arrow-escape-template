package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzft;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzgj;
import defpackage.bj4;
import defpackage.e32;
import defpackage.ji4;
import defpackage.pv1;
import defpackage.qj4;
import defpackage.tb1;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "PrfExtensionCreator")
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public static zzak d(JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(v0(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(w0(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(Base64Utils.decodeUrlSafeNoPadding(next));
                    if (z) {
                        arrayList.add(v0(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(w0(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject r0(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64Utils.encodeUrlSafeNoPadding(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] t0(byte[] bArr) {
        tb1 tb1Var;
        ji4 ji4Var;
        int i = zzfx.a;
        qj4 qj4Var = bj4.a;
        int i2 = qj4Var.f;
        MessageDigest messageDigest = qj4Var.e;
        if (qj4Var.g) {
            try {
                tb1Var = new tb1((MessageDigest) messageDigest.clone(), i2);
            } catch (CloneNotSupportedException unused) {
                try {
                    tb1Var = new tb1(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2);
                } catch (NoSuchAlgorithmException e) {
                    defpackage.d.p(e);
                    return null;
                }
            }
        } else {
            tb1Var = new tb1(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2);
        }
        MessageDigest messageDigest2 = (MessageDigest) tb1Var.c;
        byte[] bArr2 = b;
        bArr2.getClass();
        int length = bArr2.length;
        if (tb1Var.b) {
            e32.i("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (tb1Var.b) {
            e32.i("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest2.update(bArr, 0, length2);
        if (tb1Var.b) {
            e32.i("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        tb1Var.b = true;
        int i3 = tb1Var.a;
        if (i3 == messageDigest2.getDigestLength()) {
            byte[] bArrDigest = messageDigest2.digest();
            char[] cArr = zzft.a;
            ji4Var = new ji4(bArrDigest);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest2.digest(), i3);
            char[] cArr2 = zzft.a;
            ji4Var = new ji4(bArrCopyOf);
        }
        return (byte[]) ji4Var.b.clone();
    }

    public static byte[] v0(JSONObject jSONObject) throws JSONException {
        byte[] bArrDecodeUrlSafeNoPadding = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("first"));
        if (bArrDecodeUrlSafeNoPadding.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrDecodeUrlSafeNoPadding;
        }
        byte[] bArrDecodeUrlSafeNoPadding2 = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("second"));
        if (bArrDecodeUrlSafeNoPadding2.length == 32) {
            return zzgj.a(bArrDecodeUrlSafeNoPadding, bArrDecodeUrlSafeNoPadding2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] w0(JSONObject jSONObject) {
        byte[] bArrT0 = t0(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrT0 : zzgj.a(bArrT0, t0(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.a, ((zzak) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                iHashCode ^= Objects.hashCode(bArr);
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", r0(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(Base64Utils.encodeUrlSafeNoPadding(bArr[i]), r0(bArr[i + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return pv1.n("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    public zzak(byte[][] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        for (int i = 0; i < bArr.length; i += 2) {
            if (i == 0 || bArr[i] != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            Preconditions.checkArgument(z3);
            int i2 = i + 1;
            if (bArr[i2] != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            Preconditions.checkArgument(z4);
            int length = bArr[i2].length;
            if (length == 32 || length == 64) {
                z5 = true;
            } else {
                z5 = false;
            }
            Preconditions.checkArgument(z5);
        }
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArrayArray(parcel, 1, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
