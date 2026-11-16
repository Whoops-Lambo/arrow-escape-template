package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new CustomTabLoginMethodHandler(parcel);
            case 1:
                parcel.getClass();
                return new DeviceAuthMethodHandler(parcel);
            case 2:
                parcel.getClass();
                return new GetTokenLoginMethodHandler(parcel);
            case 3:
                parcel.getClass();
                return new InstagramAppLoginMethodHandler(parcel);
            case 4:
                parcel.getClass();
                return new KatanaProxyLoginMethodHandler(parcel);
            case 5:
                parcel.getClass();
                LoginClient loginClient = new LoginClient();
                loginClient.b = -1;
                Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
                if (parcelableArray == null) {
                    parcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                int length = parcelableArray.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        loginClient.a = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
                        loginClient.b = parcel.readInt();
                        loginClient.g = (LoginClient.Request) parcel.readParcelable(LoginClient.Request.class.getClassLoader());
                        HashMap mapS = v0.S(parcel);
                        loginClient.h = mapS != null ? new LinkedHashMap(mapS) : null;
                        HashMap mapS2 = v0.S(parcel);
                        loginClient.i = mapS2 != null ? new LinkedHashMap(mapS2) : null;
                        return loginClient;
                    }
                    Parcelable parcelable = parcelableArray[i];
                    LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
                    if (loginMethodHandler != null) {
                        loginMethodHandler.b = loginClient;
                    }
                    if (loginMethodHandler != null) {
                        arrayList.add(loginMethodHandler);
                    }
                    i++;
                }
                break;
            default:
                parcel.getClass();
                return new WebViewLoginMethodHandler(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CustomTabLoginMethodHandler[i];
            case 1:
                return new DeviceAuthMethodHandler[i];
            case 2:
                return new GetTokenLoginMethodHandler[i];
            case 3:
                return new InstagramAppLoginMethodHandler[i];
            case 4:
                return new KatanaProxyLoginMethodHandler[i];
            case 5:
                return new LoginClient[i];
            default:
                return new WebViewLoginMethodHandler[i];
        }
    }
}
