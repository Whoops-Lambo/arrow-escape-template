package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gj1 extends Handler {
    public final WeakReference a;
    public WeakReference b;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        lk1.a(data);
        ij1 ij1Var = (ij1) weakReference2.get();
        Messenger messenger = (Messenger) this.b.get();
        try {
            int i = message.what;
            if (i == 1) {
                lk1.a(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                ij1Var.getClass();
                return;
            }
            if (i == 2) {
                ij1Var.getClass();
                return;
            }
            if (i != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            lk1.a(data.getBundle("data_options"));
            lk1.a(data.getBundle("data_notify_children_changed_options"));
            String string = data.getString("data_media_item_id");
            data.getParcelableArrayList("data_media_item_list");
            if (ij1Var.g != messenger) {
                return;
            }
            if (ij1Var.e.get(string) != null) {
                throw new ClassCastException();
            }
            if (kj1.b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                ij1Var.getClass();
            }
        }
    }

    public gj1(ij1 ij1Var) {
        this.a = new WeakReference(ij1Var);
    }
}
