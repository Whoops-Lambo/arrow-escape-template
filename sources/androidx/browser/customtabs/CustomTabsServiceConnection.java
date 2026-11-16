package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import androidx.annotation.RestrictTo;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {
    private Context mApplicationContext;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsServiceConnection$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends CustomTabsClient {
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient);

    @RestrictTo
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new AnonymousClass1(ICustomTabsService.Stub.asInterface(iBinder), componentName));
        } else {
            e32.i("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
    }

    @RestrictTo
    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
