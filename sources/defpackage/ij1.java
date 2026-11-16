package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.collection.ArrayMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ij1 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final gj1 d = new gj1(this);
    public final ArrayMap e = new ArrayMap(0);
    public uf1 f;
    public Messenger g;
    public MediaSessionCompat$Token h;

    public ij1(Context context, ComponentName componentName, di diVar) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        diVar.b = this;
        this.b = new MediaBrowser(context, componentName, (hj1) diVar.a, bundle);
    }
}
