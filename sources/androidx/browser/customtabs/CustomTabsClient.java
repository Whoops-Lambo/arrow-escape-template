package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.IAuthTabCallback;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.util.Log;
import defpackage.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class CustomTabsClient {
    public final ICustomTabsService a;
    public final ComponentName b;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsClient$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass2 extends IAuthTabCallback.Stub {
        @Override // android.support.customtabs.IAuthTabCallback
        public final void onExtraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public final void onNavigationEvent(int i, Bundle bundle) {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public final void onWarmupCompleted(Bundle bundle) {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public final Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
            return Bundle.EMPTY;
        }
    }

    public static void b(Context context, String str) {
        if (str == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
            a(applicationContext, str, new CustomTabsServiceConnection() { // from class: androidx.browser.customtabs.CustomTabsClient.1
                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                }

                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                    try {
                        customTabsClient.a.warmup(0L);
                    } catch (RemoteException unused) {
                    }
                    applicationContext.unbindService(this);
                }
            });
        } catch (SecurityException unused) {
        }
    }

    public final CustomTabsSession d(final CustomTabsCallback customTabsCallback) {
        ICustomTabsService iCustomTabsService = this.a;
        ICustomTabsCallback.Stub stub = new ICustomTabsCallback.Stub() { // from class: androidx.browser.customtabs.CustomTabsClient.3
            public final Handler a = new Handler(Looper.getMainLooper());

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void extraCallback(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.extraCallback(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
                CustomTabsCallback customTabsCallback2 = customTabsCallback;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void onActivityLayout(final int i, final int i2, final int i3, final int i4, final int i5, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onActivityLayout(i, i2, i3, i4, i5, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void onActivityResized(final int i, final int i2, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onActivityResized(i, i2, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void onMessageChannelReady(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onMessageChannelReady(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void onMinimized(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onMinimized(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void onNavigationEvent(final int i, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onNavigationEvent(i, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void onPostMessage(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onPostMessage(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void onRelationshipValidationResult(final int i, final Uri uri, final boolean z, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onRelationshipValidationResult(i, uri, z, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void onUnminimized(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onUnminimized(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void onWarmupCompleted(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.a.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onWarmupCompleted(bundle);
                    }
                });
            }
        };
        try {
            if (iCustomTabsService.newSession(stub)) {
                return new CustomTabsSession(iCustomTabsService, stub, this.b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public CustomTabsClient(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.a = iCustomTabsService;
        this.b = componentName;
    }

    public static boolean a(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!str.isEmpty()) {
            intent.setPackage(str);
            return context.bindService(intent, customTabsServiceConnection, 33);
        }
        d.r("Service Intents must be explicit");
        return false;
    }

    public static String c(Context context, List list, boolean z) {
        List<String> arrayList;
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v));
        if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }
}
