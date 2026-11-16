package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzai extends com.google.android.gms.internal.games_v2.zzb implements zzaj {
    public zzai() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 6001 || i == 6002) {
            parcel.readString();
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
        } else if (i == 12011) {
            DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
            zzc(dataHolder);
        } else if (i == 12012) {
            int i3 = parcel.readInt();
            String string = parcel.readString();
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
            zzp(i3, string);
        } else if (i == 13001) {
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
        } else if (i == 13002) {
            parcel.readInt();
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
        } else if (i == 19001) {
            parcel.readInt();
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
        } else if (i != 19002) {
            switch (i) {
                case 5001:
                    parcel.readInt();
                    parcel.readString();
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    break;
                case 5002:
                    DataHolder dataHolder2 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    zzb(dataHolder2);
                    break;
                case 5003:
                    int i4 = parcel.readInt();
                    String string2 = parcel.readString();
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    zzd(i4, string2);
                    break;
                case 5004:
                    DataHolder dataHolder3 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    zze(dataHolder3);
                    break;
                case IronSourceConstants.errorCode_loadException /* 5005 */:
                    Parcelable.Creator<DataHolder> creator = DataHolder.CREATOR;
                    DataHolder dataHolder4 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, creator);
                    DataHolder dataHolder5 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, creator);
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    zzf(dataHolder4, dataHolder5);
                    break;
                case IronSourceConstants.errorCode_showFailed /* 5006 */:
                    DataHolder dataHolder6 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    zzg(dataHolder6);
                    break;
                case IronSourceConstants.errorCode_initSuccess /* 5007 */:
                    DataHolder dataHolder7 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    zzh(dataHolder7);
                    break;
                case IronSourceConstants.errorCode_initFailed /* 5008 */:
                    DataHolder dataHolder8 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    zzi(dataHolder8);
                    break;
                case IronSourceConstants.errorCode_adClosed /* 5009 */:
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    break;
                case IronSourceConstants.errorCode_destroy /* 5010 */:
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    break;
                case IronSourceConstants.errorCode_internal /* 5011 */:
                    com.google.android.gms.internal.games_v2.zzc.d(parcel);
                    break;
                default:
                    if (i == 9001) {
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        break;
                    } else if (i == 11001) {
                        parcel.readInt();
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        break;
                    } else if (i == 12001) {
                        DataHolder dataHolder9 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        zzl(dataHolder9);
                        break;
                    } else if (i == 14001) {
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        break;
                    } else if (i == 15001) {
                        DataHolder dataHolder10 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        zzq(dataHolder10);
                        break;
                    } else if (i == 17002) {
                        parcel.readInt();
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        break;
                    } else if (i == 20012) {
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        break;
                    } else if (i == 24002) {
                        int i5 = com.google.android.gms.internal.games_v2.zzc.a;
                        parcel.readInt();
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        break;
                    } else if (i == 20019) {
                        parcel.readInt();
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        break;
                    } else if (i == 20020) {
                        parcel.readInt();
                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                        break;
                    } else {
                        switch (i) {
                            case 5016:
                                zzj();
                                break;
                            case 5017:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5018:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5019:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5020:
                                parcel.readInt();
                                parcel.readString();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5021:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5022:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5023:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5024:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5025:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5026:
                                parcel.createStringArray();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5027:
                                parcel.createStringArray();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5028:
                                parcel.createStringArray();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5029:
                                parcel.createStringArray();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5030:
                                parcel.createStringArray();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5031:
                                parcel.createStringArray();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5032:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5033:
                                parcel.readInt();
                                parcel.readInt();
                                parcel.readString();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5034:
                                parcel.readInt();
                                parcel.readString();
                                int i6 = com.google.android.gms.internal.games_v2.zzc.a;
                                parcel.readInt();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5035:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5036:
                                parcel.readInt();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5037:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5038:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5039:
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            case 5040:
                                parcel.readInt();
                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                break;
                            default:
                                switch (i) {
                                    case 19008:
                                        parcel.readInt();
                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                        break;
                                    case 19009:
                                        parcel.readInt();
                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                        break;
                                    case 19010:
                                        parcel.readInt();
                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                        break;
                                    default:
                                        switch (i) {
                                            case AD_SERVER_ERROR_VALUE:
                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                break;
                                            case 20002:
                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                break;
                                            case 20003:
                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                break;
                                            case 20004:
                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                break;
                                            case 20005:
                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                break;
                                            case 20006:
                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                break;
                                            case 20007:
                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                break;
                                            case 20008:
                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                break;
                                            case 20009:
                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                break;
                                            default:
                                                switch (i) {
                                                    case 23001:
                                                        parcel.readInt();
                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                        break;
                                                    case 23002:
                                                        parcel.readInt();
                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                        break;
                                                    case 23003:
                                                        parcel.readInt();
                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                        break;
                                                    case 23004:
                                                        parcel.readInt();
                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                        break;
                                                    case 23005:
                                                        parcel.readInt();
                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 25002:
                                                                parcel.readString();
                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                break;
                                                            case 25003:
                                                                Status status = (Status) com.google.android.gms.internal.games_v2.zzc.a(parcel, Status.CREATOR);
                                                                String string3 = parcel.readString();
                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                zzr(status, string3);
                                                                break;
                                                            case 25004:
                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                break;
                                                            case 25005:
                                                                parcel.readInt();
                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                break;
                                                            case 25006:
                                                                parcel.readInt();
                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                break;
                                                            case 25007:
                                                                Status status2 = (Status) com.google.android.gms.internal.games_v2.zzc.a(parcel, Status.CREATOR);
                                                                String string4 = parcel.readString();
                                                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                zzs(status2, string4, arrayListCreateStringArrayList);
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 8001:
                                                                        DataHolder dataHolder11 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        zzk(dataHolder11);
                                                                        break;
                                                                    case 8002:
                                                                        parcel.readInt();
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        break;
                                                                    case 8003:
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        break;
                                                                    case 8004:
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        break;
                                                                    case 8005:
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        break;
                                                                    case 8006:
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        break;
                                                                    case 8007:
                                                                        parcel.readInt();
                                                                        parcel.readString();
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        break;
                                                                    case 8008:
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        break;
                                                                    case 8009:
                                                                        parcel.readString();
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        break;
                                                                    case 8010:
                                                                        parcel.readString();
                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 10001:
                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                break;
                                                                            case 10002:
                                                                                parcel.readString();
                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                break;
                                                                            case GamesActivityResultCodes.RESULT_LICENSE_FAILED /* 10003 */:
                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                break;
                                                                            case GamesActivityResultCodes.RESULT_APP_MISCONFIGURED /* 10004 */:
                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                break;
                                                                            case 10005:
                                                                                parcel.readInt();
                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                break;
                                                                            case GamesActivityResultCodes.RESULT_NETWORK_FAILURE /* 10006 */:
                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 12004:
                                                                                        DataHolder dataHolder12 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                                                                                        Contents contents = (Contents) com.google.android.gms.internal.games_v2.zzc.a(parcel, Contents.CREATOR);
                                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                        zzm(dataHolder12, contents);
                                                                                        break;
                                                                                    case 12005:
                                                                                        DataHolder dataHolder13 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                        zzo(dataHolder13);
                                                                                        break;
                                                                                    case 12006:
                                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                        break;
                                                                                    case 12007:
                                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                        break;
                                                                                    case 12008:
                                                                                        com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                        break;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 12014:
                                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                                break;
                                                                                            case 12015:
                                                                                                parcel.readInt();
                                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                                break;
                                                                                            case 12016:
                                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                                break;
                                                                                            case 12017:
                                                                                                DataHolder dataHolder14 = (DataHolder) com.google.android.gms.internal.games_v2.zzc.a(parcel, DataHolder.CREATOR);
                                                                                                String string5 = parcel.readString();
                                                                                                Parcelable.Creator<Contents> creator2 = Contents.CREATOR;
                                                                                                Contents contents2 = (Contents) com.google.android.gms.internal.games_v2.zzc.a(parcel, creator2);
                                                                                                Contents contents3 = (Contents) com.google.android.gms.internal.games_v2.zzc.a(parcel, creator2);
                                                                                                Contents contents4 = (Contents) com.google.android.gms.internal.games_v2.zzc.a(parcel, creator2);
                                                                                                com.google.android.gms.internal.games_v2.zzc.d(parcel);
                                                                                                zzn(dataHolder14, string5, contents2, contents3, contents4);
                                                                                                break;
                                                                                            default:
                                                                                                return false;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                    break;
            }
        } else {
            parcel.readInt();
            int i7 = com.google.android.gms.internal.games_v2.zzc.a;
            parcel.readInt();
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
