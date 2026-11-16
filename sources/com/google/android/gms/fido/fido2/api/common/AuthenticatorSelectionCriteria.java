package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.h50;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AuthenticatorSelectionCriteriaCreator")
@SafeParcelable.Reserved({1})
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzm();
    public final Attachment a;
    public final Boolean b;
    public final UserVerificationRequirement c;
    public final ResidentKeyRequirement d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public Attachment a;
        public Boolean b;
        public ResidentKeyRequirement c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return Objects.equal(this.a, authenticatorSelectionCriteria.a) && Objects.equal(this.b, authenticatorSelectionCriteria.b) && Objects.equal(this.c, authenticatorSelectionCriteria.c) && Objects.equal(r0(), authenticatorSelectionCriteria.r0());
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, r0());
    }

    public final ResidentKeyRequirement r0() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        if (residentKeyRequirement == null) {
            residentKeyRequirement = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
                }
                return null;
            }
        }
        return residentKeyRequirement;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.c);
        String strValueOf3 = String.valueOf(this.d);
        StringBuilder sbR = h50.r("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbR.append(this.b);
        sbR.append(", \n requireUserVerification=");
        sbR.append(strValueOf2);
        sbR.append(", \n residentKeyRequirement=");
        return nj.q(sbR, strValueOf3, "\n }");
    }

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentA;
        UserVerificationRequirement userVerificationRequirementA;
        ResidentKeyRequirement residentKeyRequirementA;
        if (str == null) {
            attachmentA = null;
        } else {
            try {
                attachmentA = Attachment.a(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e) {
                defpackage.d.n(e);
                throw null;
            }
        }
        this.a = attachmentA;
        this.b = bool;
        if (str2 == null) {
            userVerificationRequirementA = null;
        } else {
            userVerificationRequirementA = UserVerificationRequirement.a(str2);
        }
        this.c = userVerificationRequirementA;
        if (str3 == null) {
            residentKeyRequirementA = null;
        } else {
            residentKeyRequirementA = ResidentKeyRequirement.a(str3);
        }
        this.d = residentKeyRequirementA;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        String str3 = null;
        Attachment attachment = this.a;
        if (attachment == null) {
            str = null;
        } else {
            str = attachment.a;
        }
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeBooleanObject(parcel, 3, this.b, false);
        UserVerificationRequirement userVerificationRequirement = this.c;
        if (userVerificationRequirement == null) {
            str2 = null;
        } else {
            str2 = userVerificationRequirement.a;
        }
        SafeParcelWriter.writeString(parcel, 4, str2, false);
        ResidentKeyRequirement residentKeyRequirementR0 = r0();
        if (residentKeyRequirementR0 != null) {
            str3 = residentKeyRequirementR0.a;
        }
        SafeParcelWriter.writeString(parcel, 5, str3, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
