package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.internal.zzv;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zzao;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class s42 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ s42(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        boolean z = false;
        x11 x11Var = null;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        zzaia zzaiaVar = null;
        zzad zzadVar = null;
        switch (this.a) {
            case 0:
                return new Requirements(parcel.readInt());
            case 1:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = l52.b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(x11.W8);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof x11)) {
                        w11 w11Var = new w11();
                        w11Var.a = strongBinder;
                        x11Var = w11Var;
                    } else {
                        x11Var = (x11) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.a = x11Var;
                return resultReceiver;
            case 2:
                parcel.getClass();
                ShareCameraEffectContent shareCameraEffectContent = new ShareCameraEffectContent(parcel);
                shareCameraEffectContent.g = parcel.readString();
                fo foVar = new fo(0);
                CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
                if (cameraEffectArguments != null) {
                    foVar.a.putAll(cameraEffectArguments.a);
                }
                shareCameraEffectContent.h = new CameraEffectArguments(foVar);
                fo foVar2 = new fo(1);
                CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
                if (cameraEffectTextures != null) {
                    foVar2.a.putAll(cameraEffectTextures.a);
                }
                shareCameraEffectContent.i = new CameraEffectTextures(foVar2);
                return shareCameraEffectContent;
            case 3:
                parcel.getClass();
                return new ShareFeedContent(parcel);
            case 4:
                parcel.getClass();
                return new ShareHashtag(parcel);
            case 5:
                parcel.getClass();
                return new ShareLinkContent(parcel);
            case 6:
                parcel.getClass();
                return new ShareMediaContent(parcel);
            case 7:
                parcel.getClass();
                return new SharePhoto(parcel);
            case 8:
                parcel.getClass();
                return new SharePhotoContent(parcel);
            case 9:
                parcel.getClass();
                return new ShareStoryContent(parcel);
            case 10:
                parcel.getClass();
                return new ShareVideo(parcel);
            case 11:
                parcel.getClass();
                return new ShareVideoContent(parcel);
            case 12:
                return new SpliceNullCommand();
            case 13:
                return new StreamKey(parcel);
            case 14:
                return new TextInformationFrame(parcel);
            case 15:
                return new UrlLinkFrame(parcel);
            case 16:
                return new VorbisComment(parcel);
            case 17:
                return new com.google.android.exoplayer2.metadata.flac.VorbisComment(parcel);
            case 18:
                return new WrappedParcelable(parcel);
            case 19:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                zzv zzvVar = null;
                zzc zzcVar = null;
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(header);
                    if (fieldId == 1) {
                        zzadVar = (zzad) SafeParcelReader.createParcelable(parcel, header, zzad.CREATOR);
                    } else if (fieldId == 2) {
                        zzvVar = (zzv) SafeParcelReader.createParcelable(parcel, header, zzv.CREATOR);
                    } else if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        zzcVar = (zzc) SafeParcelReader.createParcelable(parcel, header, zzc.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                zzx zzxVar = new zzx();
                zzxVar.a = zzadVar;
                zzxVar.b = zzvVar;
                zzxVar.c = zzcVar;
                return zzxVar;
            case 20:
                int iValidateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z2 = false;
                String strCreateString5 = null;
                String strCreateString6 = null;
                String strCreateString7 = null;
                String strCreateString8 = null;
                String strCreateString9 = null;
                String strCreateString10 = null;
                String strCreateString11 = null;
                while (parcel.dataPosition() < iValidateObjectHeader2) {
                    int header2 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header2)) {
                        case 1:
                            strCreateString5 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 2:
                            strCreateString6 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 3:
                            strCreateString9 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 4:
                            strCreateString8 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 5:
                            strCreateString7 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 6:
                            strCreateString10 = SafeParcelReader.createString(parcel, header2);
                            break;
                        case 7:
                            z2 = SafeParcelReader.readBoolean(parcel, header2);
                            break;
                        case 8:
                            strCreateString11 = SafeParcelReader.createString(parcel, header2);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header2);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader2);
                return new zzz(strCreateString5, strCreateString6, strCreateString7, strCreateString8, strCreateString9, strCreateString10, z2, strCreateString11);
            case 21:
                int iValidateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                zzz zzzVar = null;
                String strCreateString12 = null;
                String strCreateString13 = null;
                ArrayList arrayListCreateTypedList = null;
                ArrayList<String> arrayListCreateStringList = null;
                String strCreateString14 = null;
                Boolean booleanObject = null;
                zzaf zzafVar = null;
                zzc zzcVar2 = null;
                zzbl zzblVar = null;
                ArrayList arrayListCreateTypedList2 = null;
                while (parcel.dataPosition() < iValidateObjectHeader3) {
                    int header3 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header3)) {
                        case 1:
                            zzaiaVar = (zzaia) SafeParcelReader.createParcelable(parcel, header3, zzaia.CREATOR);
                            break;
                        case 2:
                            zzzVar = (zzz) SafeParcelReader.createParcelable(parcel, header3, zzz.CREATOR);
                            break;
                        case 3:
                            strCreateString12 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 4:
                            strCreateString13 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 5:
                            arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header3, zzz.CREATOR);
                            break;
                        case 6:
                            arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header3);
                            break;
                        case 7:
                            strCreateString14 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 8:
                            booleanObject = SafeParcelReader.readBooleanObject(parcel, header3);
                            break;
                        case 9:
                            zzafVar = (zzaf) SafeParcelReader.createParcelable(parcel, header3, zzaf.CREATOR);
                            break;
                        case 10:
                            z = SafeParcelReader.readBoolean(parcel, header3);
                            break;
                        case 11:
                            zzcVar2 = (zzc) SafeParcelReader.createParcelable(parcel, header3, zzc.CREATOR);
                            break;
                        case 12:
                            zzblVar = (zzbl) SafeParcelReader.createParcelable(parcel, header3, zzbl.CREATOR);
                            break;
                        case 13:
                            arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header3, zzao.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header3);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader3);
                zzad zzadVar2 = new zzad();
                zzadVar2.a = zzaiaVar;
                zzadVar2.b = zzzVar;
                zzadVar2.c = strCreateString12;
                zzadVar2.d = strCreateString13;
                zzadVar2.e = arrayListCreateTypedList;
                zzadVar2.f = arrayListCreateStringList;
                zzadVar2.g = strCreateString14;
                zzadVar2.h = booleanObject;
                zzadVar2.i = zzafVar;
                zzadVar2.j = z;
                zzadVar2.k = zzcVar2;
                zzadVar2.l = zzblVar;
                zzadVar2.m = arrayListCreateTypedList2;
                return zzadVar2;
            case 22:
                int iValidateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                long j2 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader4) {
                    int header4 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(header4);
                    if (fieldId2 == 1) {
                        j = SafeParcelReader.readLong(parcel, header4);
                    } else if (fieldId2 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header4);
                    } else {
                        j2 = SafeParcelReader.readLong(parcel, header4);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader4);
                return new zzaf(j, j2);
            case 23:
                int iValidateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader5) {
                    int header5 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header5) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header5);
                    } else {
                        strCreateString4 = SafeParcelReader.createString(parcel, header5);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader5);
                return new GithubAuthCredential(strCreateString4);
            case 24:
                int iValidateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString15 = null;
                while (parcel.dataPosition() < iValidateObjectHeader6) {
                    int header6 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(header6);
                    if (fieldId3 == 1) {
                        strCreateString3 = SafeParcelReader.createString(parcel, header6);
                    } else if (fieldId3 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header6);
                    } else {
                        strCreateString15 = SafeParcelReader.createString(parcel, header6);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader6);
                return new GoogleAuthCredential(strCreateString3, strCreateString15);
            case 25:
                int iValidateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList arrayListCreateTypedList3 = null;
                com.google.firebase.auth.internal.zzao zzaoVar = null;
                String strCreateString16 = null;
                zzc zzcVar3 = null;
                zzad zzadVar3 = null;
                ArrayList arrayListCreateTypedList4 = null;
                while (parcel.dataPosition() < iValidateObjectHeader7) {
                    int header7 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header7)) {
                        case 1:
                            arrayListCreateTypedList3 = SafeParcelReader.createTypedList(parcel, header7, PhoneMultiFactorInfo.CREATOR);
                            break;
                        case 2:
                            zzaoVar = (com.google.firebase.auth.internal.zzao) SafeParcelReader.createParcelable(parcel, header7, com.google.firebase.auth.internal.zzao.CREATOR);
                            break;
                        case 3:
                            strCreateString16 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 4:
                            zzcVar3 = (zzc) SafeParcelReader.createParcelable(parcel, header7, zzc.CREATOR);
                            break;
                        case 5:
                            zzadVar3 = (zzad) SafeParcelReader.createParcelable(parcel, header7, zzad.CREATOR);
                            break;
                        case 6:
                            arrayListCreateTypedList4 = SafeParcelReader.createTypedList(parcel, header7, TotpMultiFactorInfo.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header7);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader7);
                return new zzaj(arrayListCreateTypedList3, zzaoVar, strCreateString16, zzcVar3, zzadVar3, arrayListCreateTypedList4);
            case 26:
                int iValidateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString17 = null;
                String strCreateString18 = null;
                while (parcel.dataPosition() < iValidateObjectHeader8) {
                    int header8 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(header8);
                    if (fieldId4 == 1) {
                        strCreateString2 = SafeParcelReader.createString(parcel, header8);
                    } else if (fieldId4 == 2) {
                        strCreateString17 = SafeParcelReader.createString(parcel, header8);
                    } else if (fieldId4 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header8);
                    } else {
                        strCreateString18 = SafeParcelReader.createString(parcel, header8);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader8);
                return new zzao(strCreateString2, strCreateString17, strCreateString18);
            case 27:
                int iValidateObjectHeader9 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString19 = null;
                ArrayList arrayListCreateTypedList5 = null;
                ArrayList arrayListCreateTypedList6 = null;
                zzad zzadVar4 = null;
                while (parcel.dataPosition() < iValidateObjectHeader9) {
                    int header9 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(header9);
                    if (fieldId5 == 1) {
                        strCreateString = SafeParcelReader.createString(parcel, header9);
                    } else if (fieldId5 == 2) {
                        strCreateString19 = SafeParcelReader.createString(parcel, header9);
                    } else if (fieldId5 == 3) {
                        arrayListCreateTypedList5 = SafeParcelReader.createTypedList(parcel, header9, PhoneMultiFactorInfo.CREATOR);
                    } else if (fieldId5 == 4) {
                        arrayListCreateTypedList6 = SafeParcelReader.createTypedList(parcel, header9, TotpMultiFactorInfo.CREATOR);
                    } else if (fieldId5 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header9);
                    } else {
                        zzadVar4 = (zzad) SafeParcelReader.createParcelable(parcel, header9, zzad.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader9);
                com.google.firebase.auth.internal.zzao zzaoVar2 = new com.google.firebase.auth.internal.zzao();
                zzaoVar2.a = strCreateString;
                zzaoVar2.b = strCreateString19;
                zzaoVar2.c = arrayListCreateTypedList5;
                zzaoVar2.d = arrayListCreateTypedList6;
                zzaoVar2.e = zzadVar4;
                return zzaoVar2;
            case 28:
                int iValidateObjectHeader10 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z3 = false;
                String strCreateString20 = null;
                String strCreateString21 = null;
                String strCreateString22 = null;
                String strCreateString23 = null;
                while (parcel.dataPosition() < iValidateObjectHeader10) {
                    int header10 = SafeParcelReader.readHeader(parcel);
                    int fieldId6 = SafeParcelReader.getFieldId(header10);
                    if (fieldId6 == 1) {
                        strCreateString20 = SafeParcelReader.createString(parcel, header10);
                    } else if (fieldId6 == 2) {
                        strCreateString21 = SafeParcelReader.createString(parcel, header10);
                    } else if (fieldId6 == 4) {
                        strCreateString22 = SafeParcelReader.createString(parcel, header10);
                    } else if (fieldId6 == 5) {
                        z3 = SafeParcelReader.readBoolean(parcel, header10);
                    } else if (fieldId6 != 6) {
                        SafeParcelReader.skipUnknownField(parcel, header10);
                    } else {
                        strCreateString23 = SafeParcelReader.createString(parcel, header10);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader10);
                return new PhoneAuthCredential(strCreateString20, strCreateString21, strCreateString22, z3, strCreateString23);
            default:
                int iValidateObjectHeader11 = SafeParcelReader.validateObjectHeader(parcel);
                long j3 = 0;
                String strCreateString24 = null;
                String strCreateString25 = null;
                String strCreateString26 = null;
                while (parcel.dataPosition() < iValidateObjectHeader11) {
                    int header11 = SafeParcelReader.readHeader(parcel);
                    int fieldId7 = SafeParcelReader.getFieldId(header11);
                    if (fieldId7 == 1) {
                        strCreateString24 = SafeParcelReader.createString(parcel, header11);
                    } else if (fieldId7 == 2) {
                        strCreateString25 = SafeParcelReader.createString(parcel, header11);
                    } else if (fieldId7 == 3) {
                        j3 = SafeParcelReader.readLong(parcel, header11);
                    } else if (fieldId7 != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header11);
                    } else {
                        strCreateString26 = SafeParcelReader.createString(parcel, header11);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader11);
                return new PhoneMultiFactorInfo(j3, strCreateString24, strCreateString25, strCreateString26);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Requirements[i];
            case 1:
                return new ResultReceiver[i];
            case 2:
                return new ShareCameraEffectContent[i];
            case 3:
                return new ShareFeedContent[i];
            case 4:
                return new ShareHashtag[i];
            case 5:
                return new ShareLinkContent[i];
            case 6:
                return new ShareMediaContent[i];
            case 7:
                return new SharePhoto[i];
            case 8:
                return new SharePhotoContent[i];
            case 9:
                return new ShareStoryContent[i];
            case 10:
                return new ShareVideo[i];
            case 11:
                return new ShareVideoContent[i];
            case 12:
                return new SpliceNullCommand[i];
            case 13:
                return new StreamKey[i];
            case 14:
                return new TextInformationFrame[i];
            case 15:
                return new UrlLinkFrame[i];
            case 16:
                return new VorbisComment[i];
            case 17:
                return new com.google.android.exoplayer2.metadata.flac.VorbisComment[i];
            case 18:
                return new WrappedParcelable[i];
            case 19:
                return new zzx[i];
            case 20:
                return new zzz[i];
            case 21:
                return new zzad[i];
            case 22:
                return new zzaf[i];
            case 23:
                return new GithubAuthCredential[i];
            case 24:
                return new GoogleAuthCredential[i];
            case 25:
                return new zzaj[i];
            case 26:
                return new zzao[i];
            case 27:
                return new com.google.firebase.auth.internal.zzao[i];
            case 28:
                return new PhoneAuthCredential[i];
            default:
                return new PhoneMultiFactorInfo[i];
        }
    }
}
