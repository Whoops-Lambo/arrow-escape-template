package com.singular.sdk.internal;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import defpackage.h50;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class NetworkMonitor {
    private static ConnectivityManager.NetworkCallback networkCallback;
    private static final SingularLog logger = SingularLog.getLogger("NetworkMonitor");
    private static final ExecutorService notifyExecutor = Executors.newSingleThreadExecutor();

    private static ConnectivityManager getConnectivityManager(Context context) {
        if (context == null) {
            return null;
        }
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    @RequiresApi
    private static boolean isConnectedAndroid23AndAbove(ConnectivityManager connectivityManager) {
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                logger.debug("getActiveNetwork is null, returning false");
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(12);
            }
            logger.debug("getNetworkCapabilities is null, returning false");
            return false;
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("NetworkMonitor.isConnectedAndroid23AndAbove: "), logger);
            return false;
        }
    }

    private static boolean isConnectedAndroidBelow23(ConnectivityManager connectivityManager) {
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("NetworkMonitor.isConnectedAndroidBelow23: "), logger);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class NetworkChange extends BroadcastReceiver {
        private final ApiManager apiManager;

        public NetworkChange(@NonNull ApiManager apiManager) {
            this.apiManager = apiManager;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkMonitor.logger.debug("onReceive() action=%s ", intent.getAction());
            NetworkMonitor.notifyNetworkChange(context, this.apiManager);
        }
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return getConnectionTypeAndroid23AndAbove(connectivityManager);
        }
        logger.debug("connectivityManager is null, returning unknown");
        return "unknown";
    }

    @RequiresApi
    private static String getConnectionTypeAndroid23AndAbove(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return "unknown";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            return networkCapabilities.hasTransport(0) ? Constants.WWAN : "unknown";
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("NetworkMonitor.getConnectionTypeAndroid23AndAbove: "), logger);
            return "unknown";
        }
    }

    private static String getConnectionTypeAndroidBelow23(ConnectivityManager connectivityManager) {
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    return "wifi";
                }
                if (type == 0) {
                    return Constants.WWAN;
                }
            }
            return "unknown";
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("NetworkMonitor.getConnectionTypeAndroidBelow23: "), logger);
            return "unknown";
        }
    }

    private static void unregisterExistingNetworkCallback(@NonNull ConnectivityManager connectivityManager) {
        ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
        if (networkCallback2 != null) {
            try {
                connectivityManager.unregisterNetworkCallback(networkCallback2);
            } catch (Throwable th) {
                logger.debug("NetworkMonitor: Error unregistering existing NetworkCallback: " + Utils.formatException(th));
            }
            networkCallback = null;
        }
    }

    private static void unregisterNetworkCallbackAndroid21AndAbove(@NonNull ConnectivityManager connectivityManager) {
        ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
        if (networkCallback2 == null) {
            logger.debug("NetworkMonitor: NetworkCallback not registered, skipping unregister");
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(networkCallback2);
            logger.debug("NetworkMonitor: unregisterNetworkChangeListener() - NetworkCallback unregistered");
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("NetworkMonitor: Error unregistering NetworkCallback: "), logger);
        }
        networkCallback = null;
    }

    public static boolean isApiResultMismatch_isConnected(Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null) {
            logger.debug("connectivityManager is null");
        }
        if (isConnectedAndroid23AndAbove(connectivityManager) != isConnectedAndroidBelow23(connectivityManager)) {
            return true;
        }
        return false;
    }

    public static boolean isConnected(Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null) {
            logger.debug("connectivityManager is null, returning false");
            return false;
        }
        return isConnectedAndroid23AndAbove(connectivityManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyNetworkChange(@NonNull Context context, @NonNull final ApiManager apiManager) {
        if (isConnected(context)) {
            logger.debug("notifyNetworkChange isConnected = true");
            notifyExecutor.execute(new Runnable() { // from class: com.singular.sdk.internal.NetworkMonitor.3
                @Override // java.lang.Runnable
                public void run() {
                    apiManager.wakeUp();
                }
            });
        } else {
            logger.debug("notifyNetworkChange isConnected = false");
        }
    }

    @SuppressLint({"MissingPermission"})
    private static void registerNetworkCallbackAndroid21To23(@NonNull ConnectivityManager connectivityManager, @NonNull Context context, @NonNull final ApiManager apiManager) {
        unregisterExistingNetworkCallback(connectivityManager);
        try {
            final Context applicationContext = context.getApplicationContext();
            networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.singular.sdk.internal.NetworkMonitor.2
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(@NonNull Network network) {
                    NetworkMonitor.logger.debug("onAvailable");
                    NetworkMonitor.notifyNetworkChange(applicationContext, apiManager);
                }
            };
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), networkCallback);
            logger.debug("NetworkMonitor: registerNetworkChangeListener() - NetworkCallback registered (API 21-23)");
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("NetworkMonitor: Error registering NetworkCallback: "), logger);
            networkCallback = null;
        }
    }

    @RequiresApi
    @SuppressLint({"MissingPermission"})
    private static void registerNetworkCallbackAndroid24AndAbove(@NonNull ConnectivityManager connectivityManager, @NonNull Context context, @NonNull final ApiManager apiManager) {
        unregisterExistingNetworkCallback(connectivityManager);
        try {
            final Context applicationContext = context.getApplicationContext();
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: com.singular.sdk.internal.NetworkMonitor.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(@NonNull Network network) {
                    NetworkMonitor.logger.debug("onAvailable");
                    NetworkMonitor.notifyNetworkChange(applicationContext, apiManager);
                }
            };
            networkCallback = networkCallback2;
            connectivityManager.registerDefaultNetworkCallback(networkCallback2);
            logger.debug("NetworkMonitor: registerNetworkChangeListener() - NetworkCallback registered (API 24+)");
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("NetworkMonitor: Error registering NetworkCallback: "), logger);
            networkCallback = null;
        }
    }

    public static void registerNetworkChangeListener(@NonNull Context context, @NonNull ApiManager apiManager) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null) {
            return;
        }
        registerNetworkCallbackAndroid24AndAbove(connectivityManager, context, apiManager);
    }

    public static void unregisterNetworkChangeListener(@NonNull Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager != null) {
            unregisterNetworkCallbackAndroid21AndAbove(connectivityManager);
        }
    }
}
