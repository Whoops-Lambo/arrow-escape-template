package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zaaj extends RemoteCreator {
    private static final zaaj zaa = new zaaj();

    private zaaj() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        zaaj zaajVar = zaa;
        try {
            zaah zaahVar = new zaah(1, i, i2, null);
            return (View) ObjectWrapper.z1(((zaw) zaajVar.getRemoteCreatorInstance(context)).zae(new ObjectWrapper(context), zaahVar));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException(pv1.j(i, i2, "Could not get button with size ", " and color ", new StringBuilder(String.valueOf(i).length() + 42 + String.valueOf(i2).length())), e);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zaw ? (zaw) iInterfaceQueryLocalInterface : new zaw(iBinder);
    }
}
