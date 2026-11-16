package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzcj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhi;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhk;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzhn;
import com.google.android.gms.internal.fido.zzho;
import com.google.android.gms.internal.fido.zzhp;
import com.google.android.gms.internal.fido.zzhs;
import defpackage.ak4;
import defpackage.ap4;
import defpackage.os2;
import defpackage.vq2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "AuthenticatorAttestationResponseCreator")
@SafeParcelable.Reserved({1})
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();
    public final zzgx a;
    public final zzgx b;
    public final zzgx c;
    public final String[] d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Objects.equal(this.a, authenticatorAttestationResponse.a) && Objects.equal(this.b, authenticatorAttestationResponse.b) && Objects.equal(this.c, authenticatorAttestationResponse.c);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.a)), Integer.valueOf(Objects.hashCode(this.b)), Integer.valueOf(Objects.hashCode(this.c)));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x013e A[Catch: JSONException -> 0x01a2, zzho -> 0x01a5, TRY_LEAVE, TryCatch #1 {JSONException -> 0x01a2, blocks: (B:82:0x01fc, B:84:0x0212, B:45:0x0133, B:47:0x013e, B:52:0x0152, B:55:0x016e, B:57:0x0185, B:59:0x018a, B:64:0x01a8, B:65:0x01ad, B:66:0x01ae, B:67:0x01b3, B:72:0x01be, B:74:0x01cb, B:76:0x01da, B:77:0x01ee, B:78:0x01f3, B:79:0x01f4, B:80:0x01f9, B:86:0x021c, B:87:0x0221, B:90:0x0225, B:91:0x022c, B:92:0x022d, B:93:0x0234, B:96:0x0238, B:107:0x0247, B:108:0x024e, B:100:0x023e, B:112:0x0255, B:113:0x025c, B:115:0x025e, B:116:0x0265, B:120:0x026c, B:121:0x0273, B:123:0x0275, B:124:0x027c, B:129:0x0283, B:130:0x028a), top: B:137:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c A[Catch: JSONException -> 0x01a2, zzho -> 0x01a5, TRY_ENTER, TryCatch #1 {JSONException -> 0x01a2, blocks: (B:82:0x01fc, B:84:0x0212, B:45:0x0133, B:47:0x013e, B:52:0x0152, B:55:0x016e, B:57:0x0185, B:59:0x018a, B:64:0x01a8, B:65:0x01ad, B:66:0x01ae, B:67:0x01b3, B:72:0x01be, B:74:0x01cb, B:76:0x01da, B:77:0x01ee, B:78:0x01f3, B:79:0x01f4, B:80:0x01f9, B:86:0x021c, B:87:0x0221, B:90:0x0225, B:91:0x022c, B:92:0x022d, B:93:0x0234, B:96:0x0238, B:107:0x0247, B:108:0x024e, B:100:0x023e, B:112:0x0255, B:113:0x025c, B:115:0x025e, B:116:0x0265, B:120:0x026c, B:121:0x0273, B:123:0x0275, B:124:0x027c, B:129:0x0283, B:130:0x028a), top: B:137:0x0059 }] */
    public final JSONObject r0() {
        JSONObject jSONObject;
        zzhp zzhpVar;
        byte[] bArrA;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject2 = new JSONObject();
            zzgx zzgxVar = this.b;
            if (zzgxVar != null) {
                jSONObject2.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(zzgxVar.t()));
            }
            zzgx zzgxVar2 = this.c;
            if (zzgxVar2 != null) {
                jSONObject2.put("attestationObject", Base64Utils.encodeUrlSafeNoPadding(zzgxVar2.t()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("cable")) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            try {
                jSONObject2.put("transports", jSONArray);
                try {
                    try {
                        zzhp zzhpVar2 = (zzhp) ((zzhm) zzhp.e(zzgxVar2.t()).b(zzhm.class)).b.get(new zzhn("authData"));
                        if (zzhpVar2 != null) {
                            ap4 ap4Var = ((zzhi) zzhpVar2.b(zzhi.class)).a;
                            ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(ap4Var.c, 0, ap4Var.h()).asReadOnlyBuffer();
                            try {
                                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                                if ((byteBufferAsReadOnlyBuffer.get() & 64) != 0) {
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                                    try {
                                        try {
                                            zzhs zzhsVar = new zzhs(ap4Var.n(byteBufferAsReadOnlyBuffer.position(), ap4Var.c.length).y());
                                            try {
                                                zzhp zzhpVarJ = os2.J(zzhsVar);
                                                try {
                                                    zzhsVar.close();
                                                } catch (IOException unused) {
                                                }
                                                zzcj zzcjVar = ((zzhm) zzhpVarJ.b(zzhm.class)).b;
                                                zzhp zzhpVar3 = (zzhp) zzcjVar.get(new zzhk(3L));
                                                zzhp zzhpVar4 = (zzhp) zzcjVar.get(new zzhk(1L));
                                                if (zzhpVar3 == null || zzhpVar4 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                try {
                                                    long j = ((zzhk) zzhpVar3.b(zzhk.class)).a;
                                                    long j2 = ((zzhk) zzhpVar4.b(zzhk.class)).a;
                                                    if (j2 == 1) {
                                                        jSONObject = jSONObject2;
                                                        try {
                                                            zzhpVar = (zzhp) zzcjVar.get(new zzhk(-1L));
                                                            if (zzhpVar != null) {
                                                                throw new IllegalArgumentException("COSE key missing required fields");
                                                            }
                                                            long j3 = ((zzhk) zzhpVar.b(zzhk.class)).a;
                                                            if (j2 != 2 && j3 == 1) {
                                                                zzhp zzhpVar5 = (zzhp) zzcjVar.get(new zzhk(-2L));
                                                                zzhp zzhpVar6 = (zzhp) zzcjVar.get(new zzhk(-3L));
                                                                if (zzhpVar5 == null || zzhpVar6 == null) {
                                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                                }
                                                                ap4 ap4Var2 = ((zzhi) zzhpVar5.b(zzhi.class)).a;
                                                                ap4 ap4Var3 = ((zzhi) zzhpVar6.b(zzhi.class)).a;
                                                                if (ap4Var2.c.length != 32 || ap4Var3.c.length != 32) {
                                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                                }
                                                                bArrA = zzgj.a(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), ap4Var2.t(), ap4Var3.t());
                                                            } else if (j2 == 1 || j3 != 6) {
                                                                bArrA = null;
                                                            } else {
                                                                zzhp zzhpVar7 = (zzhp) zzcjVar.get(new zzhk(-2L));
                                                                if (zzhpVar7 == null) {
                                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                                }
                                                                ap4 ap4Var4 = ((zzhi) zzhpVar7.b(zzhi.class)).a;
                                                                if (ap4Var4.c.length != 32) {
                                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                                }
                                                                bArrA = zzgj.a(Base64.decode("MCowBQYDK2VwAyEA", 0), ap4Var4.t());
                                                            }
                                                        } catch (zzho e) {
                                                            e = e;
                                                            throw new IllegalArgumentException("COSE key ill-formed", e);
                                                        }
                                                    } else if (j2 == 2) {
                                                        j2 = 2;
                                                        jSONObject = jSONObject2;
                                                        zzhpVar = (zzhp) zzcjVar.get(new zzhk(-1L));
                                                        if (zzhpVar != null) {
                                                            throw new IllegalArgumentException("COSE key missing required fields");
                                                        }
                                                        long j4 = ((zzhk) zzhpVar.b(zzhk.class)).a;
                                                        if (j2 != 2) {
                                                            if (j2 == 1) {
                                                                bArrA = null;
                                                            } else {
                                                                bArrA = null;
                                                            }
                                                        } else if (j2 == 1) {
                                                            bArrA = null;
                                                        } else {
                                                            bArrA = null;
                                                        }
                                                    } else {
                                                        jSONObject = jSONObject2;
                                                        bArrA = null;
                                                    }
                                                    JSONObject jSONObject3 = jSONObject;
                                                    jSONObject3.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(ap4Var.t()));
                                                    jSONObject3.put("publicKeyAlgorithm", j);
                                                    if (bArrA != null) {
                                                        jSONObject3.put("publicKey", Base64Utils.encodeUrlSafeNoPadding(bArrA));
                                                    }
                                                    return jSONObject3;
                                                } catch (zzho e2) {
                                                    e = e2;
                                                }
                                            } catch (Throwable th) {
                                                try {
                                                    try {
                                                        zzhsVar.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                    try {
                                                        throw th;
                                                    } catch (zzhj e3) {
                                                        e = e3;
                                                        throw new IllegalArgumentException("failed to parse COSE key", e);
                                                    }
                                                } catch (zzho e4) {
                                                    e = e4;
                                                    throw new IllegalArgumentException("failed to parse COSE key", e);
                                                }
                                            }
                                        } catch (zzhj e5) {
                                            e = e5;
                                            throw new IllegalArgumentException("failed to parse COSE key", e);
                                        }
                                    } catch (zzho e6) {
                                        e = e6;
                                        throw new IllegalArgumentException("failed to parse COSE key", e);
                                    }
                                    vq2.n("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                                    return null;
                                }
                                try {
                                    throw new IllegalArgumentException("authData does not include credential data");
                                } catch (IllegalArgumentException e7) {
                                    e = e7;
                                }
                            } catch (IllegalArgumentException e8) {
                                e = e8;
                            }
                            throw new IllegalArgumentException("ill-formed authenticator data", e);
                        }
                        try {
                            throw new IllegalArgumentException("attestation object missing authData");
                        } catch (zzho e9) {
                            e = e9;
                        }
                    } catch (zzho e10) {
                        e = e10;
                    }
                    throw new IllegalArgumentException("authData value has wrong type", e);
                } catch (zzhj e11) {
                    e = e11;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                } catch (zzho e12) {
                    e = e12;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                }
            } catch (JSONException e13) {
                e = e13;
            }
        } catch (JSONException e14) {
            e = e14;
        }
    }

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        ap4 ap4Var = zzgx.b;
        ap4 ap4VarR = zzgx.r(bArr4.length, bArr4);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        ap4 ap4VarR2 = zzgx.r(bArr5.length, bArr5);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        ap4 ap4VarR3 = zzgx.r(bArr6.length, bArr6);
        this.a = (zzgx) Preconditions.checkNotNull(ap4VarR);
        this.b = (zzgx) Preconditions.checkNotNull(ap4VarR2);
        this.c = (zzgx) Preconditions.checkNotNull(ap4VarR3);
        this.d = (String[]) Preconditions.checkNotNull(strArr);
    }

    public final String toString() {
        zzbi zzbiVarA = zzbj.a(this);
        ak4 ak4Var = zzgf.a;
        byte[] bArrT = this.a.t();
        zzbiVarA.a(ak4Var.c(bArrT.length, bArrT), "keyHandle");
        byte[] bArrT2 = this.b.t();
        zzbiVarA.a(ak4Var.c(bArrT2.length, bArrT2), "clientDataJSON");
        byte[] bArrT3 = this.c.t();
        zzbiVarA.a(ak4Var.c(bArrT3.length, bArrT3), "attestationObject");
        zzbiVarA.a(Arrays.toString(this.d), "transports");
        return zzbiVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.a.t(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.b.t(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.c.t(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
