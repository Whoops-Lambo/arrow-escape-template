package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import defpackage.m93;
import defpackage.s11;
import defpackage.wj1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public final void a() {
        s11 s11Var;
        ArrayList arrayList = this.c;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
        synchronized (mediaSessionCompat$Token.a) {
            s11Var = mediaSessionCompat$Token.c;
        }
        if (s11Var == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else if (it.next() != null) {
            m93.b();
        } else {
            this.d.put(null, new wj1());
            throw null;
        }
    }

    public a(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        s11 s11Var;
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.a = mediaController;
        synchronized (mediaSessionCompat$Token.a) {
            s11Var = mediaSessionCompat$Token.c;
        }
        if (s11Var == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }
}
