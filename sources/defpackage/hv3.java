package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.internal.ads.zzp;
import com.google.android.gms.internal.ads.zzq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import com.google.android.gms.internal.p002firebaseauthapi.zzajg;
import com.google.android.play.core.hsdp.protocol.PrewarmRequest;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.internal.zzv;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class hv3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ hv3(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z = false;
        boolean z2 = false;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        switch (this.a) {
            case 0:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new PlayGamesAuthCredential(strCreateString);
            case 1:
                int iValidateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString6 = null;
                String strCreateString7 = null;
                zzaje zzajeVar = null;
                long j = 0;
                while (parcel.dataPosition() < iValidateObjectHeader2) {
                    int header2 = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(header2);
                    if (fieldId == 1) {
                        strCreateString6 = SafeParcelReader.createString(parcel, header2);
                    } else if (fieldId == 2) {
                        strCreateString7 = SafeParcelReader.createString(parcel, header2);
                    } else if (fieldId == 3) {
                        j = SafeParcelReader.readLong(parcel, header2);
                    } else if (fieldId != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header2);
                    } else {
                        zzajeVar = (zzaje) SafeParcelReader.createParcelable(parcel, header2, zzaje.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader2);
                return new TotpMultiFactorInfo(strCreateString6, strCreateString7, j, zzajeVar);
            case 2:
                int iValidateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString8 = null;
                while (parcel.dataPosition() < iValidateObjectHeader3) {
                    int header3 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(header3);
                    if (fieldId2 == 1) {
                        strCreateString5 = SafeParcelReader.createString(parcel, header3);
                    } else if (fieldId2 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header3);
                    } else {
                        strCreateString8 = SafeParcelReader.createString(parcel, header3);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader3);
                return new TwitterAuthCredential(strCreateString5, strCreateString8);
            case 3:
                int iValidateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z3 = false;
                String strCreateString9 = null;
                while (parcel.dataPosition() < iValidateObjectHeader4) {
                    int header4 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(header4);
                    if (fieldId3 == 2) {
                        strCreateString4 = SafeParcelReader.createString(parcel, header4);
                    } else if (fieldId3 == 3) {
                        strCreateString9 = SafeParcelReader.createString(parcel, header4);
                    } else if (fieldId3 == 4) {
                        z = SafeParcelReader.readBoolean(parcel, header4);
                    } else if (fieldId3 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header4);
                    } else {
                        z3 = SafeParcelReader.readBoolean(parcel, header4);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader4);
                return new UserProfileChangeRequest(strCreateString4, strCreateString9, z, z3);
            case 4:
                int iValidateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z4 = false;
                boolean z5 = false;
                int i = 0;
                String strCreateString10 = null;
                String strCreateString11 = null;
                String strCreateString12 = null;
                String strCreateString13 = null;
                String strCreateString14 = null;
                String strCreateString15 = null;
                String strCreateString16 = null;
                String strCreateString17 = null;
                while (parcel.dataPosition() < iValidateObjectHeader5) {
                    int header5 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header5)) {
                        case 1:
                            strCreateString10 = SafeParcelReader.createString(parcel, header5);
                            break;
                        case 2:
                            strCreateString11 = SafeParcelReader.createString(parcel, header5);
                            break;
                        case 3:
                            strCreateString12 = SafeParcelReader.createString(parcel, header5);
                            break;
                        case 4:
                            strCreateString13 = SafeParcelReader.createString(parcel, header5);
                            break;
                        case 5:
                            z4 = SafeParcelReader.readBoolean(parcel, header5);
                            break;
                        case 6:
                            strCreateString14 = SafeParcelReader.createString(parcel, header5);
                            break;
                        case 7:
                            z5 = SafeParcelReader.readBoolean(parcel, header5);
                            break;
                        case 8:
                            strCreateString15 = SafeParcelReader.createString(parcel, header5);
                            break;
                        case 9:
                            i = SafeParcelReader.readInt(parcel, header5);
                            break;
                        case 10:
                            strCreateString16 = SafeParcelReader.createString(parcel, header5);
                            break;
                        case 11:
                            strCreateString17 = SafeParcelReader.createString(parcel, header5);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header5);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader5);
                return new ActionCodeSettings(strCreateString10, strCreateString11, strCreateString12, strCreateString13, z4, strCreateString14, z5, strCreateString15, i, strCreateString16, strCreateString17);
            case 5:
                try {
                    return UserVerificationRequirement.a(parcel.readString());
                } catch (zzbc e) {
                    dr0.m(e);
                    return null;
                }
            case 6:
                int iValidateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList arrayListCreateTypedList2 = null;
                while (parcel.dataPosition() < iValidateObjectHeader6) {
                    int header6 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(header6);
                    if (fieldId4 == 1) {
                        arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header6, PhoneMultiFactorInfo.CREATOR);
                    } else if (fieldId4 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header6);
                    } else {
                        arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header6, TotpMultiFactorInfo.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader6);
                return new zzbl(arrayListCreateTypedList, arrayListCreateTypedList2);
            case 7:
                int i2 = parcel.readInt();
                for (ErrorCode errorCode : ErrorCode.values()) {
                    if (i2 == errorCode.a) {
                        return errorCode;
                    }
                }
                return ErrorCode.b;
            case 8:
                int iValidateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString18 = null;
                String strCreateString19 = null;
                String strCreateString20 = null;
                zzajg zzajgVar = null;
                String strCreateString21 = null;
                String strCreateString22 = null;
                String strCreateString23 = null;
                while (parcel.dataPosition() < iValidateObjectHeader7) {
                    int header7 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header7)) {
                        case 1:
                            strCreateString18 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 2:
                            strCreateString19 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 3:
                            strCreateString20 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 4:
                            zzajgVar = (zzajg) SafeParcelReader.createParcelable(parcel, header7, zzajg.CREATOR);
                            break;
                        case 5:
                            strCreateString21 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 6:
                            strCreateString22 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 7:
                            strCreateString23 = SafeParcelReader.createString(parcel, header7);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header7);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader7);
                return new zzc(strCreateString18, strCreateString19, strCreateString20, zzajgVar, strCreateString21, strCreateString22, strCreateString23);
            case 9:
                int iValidateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z6 = false;
                String strCreateString24 = null;
                String strCreateString25 = null;
                String strCreateString26 = null;
                String strCreateString27 = null;
                while (parcel.dataPosition() < iValidateObjectHeader8) {
                    int header8 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(header8);
                    if (fieldId5 == 1) {
                        strCreateString24 = SafeParcelReader.createString(parcel, header8);
                    } else if (fieldId5 == 2) {
                        strCreateString25 = SafeParcelReader.createString(parcel, header8);
                    } else if (fieldId5 == 3) {
                        strCreateString26 = SafeParcelReader.createString(parcel, header8);
                    } else if (fieldId5 == 4) {
                        strCreateString27 = SafeParcelReader.createString(parcel, header8);
                    } else if (fieldId5 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header8);
                    } else {
                        z6 = SafeParcelReader.readBoolean(parcel, header8);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader8);
                return new EmailAuthCredential(strCreateString24, strCreateString25, strCreateString26, strCreateString27, z6);
            case 10:
                int iValidateObjectHeader9 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader9) {
                    int header9 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header9) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header9);
                    } else {
                        strCreateString3 = SafeParcelReader.createString(parcel, header9);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader9);
                return new FacebookAuthCredential(strCreateString3);
            case 11:
                return new PrewarmRequest(parcel);
            case 12:
                return new zzq(parcel);
            case 13:
                return new zzp(parcel);
            default:
                int iValidateObjectHeader10 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString28 = null;
                while (parcel.dataPosition() < iValidateObjectHeader10) {
                    int header10 = SafeParcelReader.readHeader(parcel);
                    int fieldId6 = SafeParcelReader.getFieldId(header10);
                    if (fieldId6 == 1) {
                        strCreateString2 = SafeParcelReader.createString(parcel, header10);
                    } else if (fieldId6 == 2) {
                        strCreateString28 = SafeParcelReader.createString(parcel, header10);
                    } else if (fieldId6 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header10);
                    } else {
                        z2 = SafeParcelReader.readBoolean(parcel, header10);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader10);
                return new zzv(strCreateString2, strCreateString28, z2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new PlayGamesAuthCredential[i];
            case 1:
                return new TotpMultiFactorInfo[i];
            case 2:
                return new TwitterAuthCredential[i];
            case 3:
                return new UserProfileChangeRequest[i];
            case 4:
                return new ActionCodeSettings[i];
            case 5:
                return new UserVerificationRequirement[i];
            case 6:
                return new zzbl[i];
            case 7:
                return new ErrorCode[i];
            case 8:
                return new zzc[i];
            case 9:
                return new EmailAuthCredential[i];
            case 10:
                return new FacebookAuthCredential[i];
            case 11:
                return new PrewarmRequest[i];
            case 12:
                return new zzq[i];
            case 13:
                return new zzp[i];
            default:
                return new zzv[i];
        }
    }
}
