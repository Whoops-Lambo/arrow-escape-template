package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.jc1;
import defpackage.nj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static String d;
    public static SideChannelManager g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api26Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api28Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api30Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api34Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class CancelTask implements Task {
        @Override // androidx.core.app.NotificationManagerCompat.Task
        public final void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.cancel(null, 0, null);
        }

        public final String toString() {
            return "CancelTask[packageName:null, id:0, tag:null, all:false]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface InterruptionFilter {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class NotificationWithIdAndTag {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class NotifyTask implements Task {
        public final String a;
        public final int b;
        public final Notification c;

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public final void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.a, this.b, null, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.a);
            sb.append(", id:");
            return nj.l(this.b, ", tag:null]", sb);
        }

        public NotifyTask(String str, int i, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = notification;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SideChannelManager implements Handler.Callback, ServiceConnection {
        public final Context a;
        public final HashMap c = new HashMap();
        public HashSet d = new HashSet();
        public final Handler b = new Handler(jc1.h("NotificationManagerCompat").getLooper(), this);

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.b.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.b.obtainMessage(2, componentName).sendToTarget();
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class ListenerRecord {
            public final ComponentName a;
            public INotificationSideChannel c;
            public boolean b = false;
            public final ArrayDeque d = new ArrayDeque();
            public int e = 0;

            public ListenerRecord(ComponentName componentName) {
                this.a = componentName;
            }
        }

        public final void d(ListenerRecord listenerRecord) {
            boolean z;
            ArrayDeque arrayDeque = listenerRecord.d;
            ComponentName componentName = listenerRecord.a;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (listenerRecord.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.a;
                boolean zBindService = context.bindService(component, this, 33);
                listenerRecord.b = zBindService;
                if (zBindService) {
                    listenerRecord.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z = listenerRecord.b;
            }
            if (!z || listenerRecord.c == null) {
                e(listenerRecord);
                return;
            }
            while (true) {
                Task task = (Task) arrayDeque.peek();
                if (task == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + task);
                    }
                    task.a(listenerRecord.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            e(listenerRecord);
        }

        public final void e(ListenerRecord listenerRecord) {
            ComponentName componentName = listenerRecord.a;
            ArrayDeque arrayDeque = listenerRecord.d;
            Handler handler = this.b;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i = listenerRecord.e;
            int i2 = i + 1;
            listenerRecord.e = i2;
            if (i2 <= 6) {
                int i3 = (1 << i) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
                }
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + listenerRecord.e + " retries");
            arrayDeque.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i = message.what;
            if (i == 0) {
                Task task = (Task) message.obj;
                Context context = this.a;
                Object obj = NotificationManagerCompat.c;
                String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
                synchronized (NotificationManagerCompat.c) {
                    if (string != null) {
                        try {
                            if (!string.equals(NotificationManagerCompat.d)) {
                                String[] strArrSplit = string.split(":", -1);
                                HashSet hashSet2 = new HashSet(strArrSplit.length);
                                for (String str : strArrSplit) {
                                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                    if (componentNameUnflattenFromString != null) {
                                        hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                    }
                                }
                                NotificationManagerCompat.e = hashSet2;
                                NotificationManagerCompat.d = string;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hashSet = NotificationManagerCompat.e;
                }
                if (!hashSet.equals(this.d)) {
                    this.d = hashSet;
                    List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet3 = new HashSet();
                    for (ResolveInfo resolveInfo : listQueryIntentServices) {
                        if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet3.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet3) {
                        if (!this.c.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                            }
                            this.c.put(componentName2, new ListenerRecord(componentName2));
                        }
                    }
                    Iterator it = this.c.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!hashSet3.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                            }
                            ListenerRecord listenerRecord = (ListenerRecord) entry.getValue();
                            if (listenerRecord.b) {
                                this.a.unbindService(this);
                                listenerRecord.b = false;
                            }
                            listenerRecord.c = null;
                            it.remove();
                        }
                    }
                }
                for (ListenerRecord listenerRecord2 : this.c.values()) {
                    listenerRecord2.d.add(task);
                    d(listenerRecord2);
                }
            } else if (i == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                ComponentName componentName3 = serviceConnectedEvent.a;
                IBinder iBinder = serviceConnectedEvent.b;
                ListenerRecord listenerRecord3 = (ListenerRecord) this.c.get(componentName3);
                if (listenerRecord3 != null) {
                    listenerRecord3.c = INotificationSideChannel.Stub.asInterface(iBinder);
                    listenerRecord3.e = 0;
                    d(listenerRecord3);
                    return true;
                }
            } else if (i == 2) {
                ListenerRecord listenerRecord4 = (ListenerRecord) this.c.get((ComponentName) message.obj);
                if (listenerRecord4 != null) {
                    if (listenerRecord4.b) {
                        this.a.unbindService(this);
                        listenerRecord4.b = false;
                    }
                    listenerRecord4.c = null;
                    return true;
                }
            } else {
                if (i != 3) {
                    return false;
                }
                ListenerRecord listenerRecord5 = (ListenerRecord) this.c.get((ComponentName) message.obj);
                if (listenerRecord5 != null) {
                    d(listenerRecord5);
                    return true;
                }
            }
            return true;
        }

        public SideChannelManager(Context context) {
            this.a = context;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Task {
        void a(INotificationSideChannel iNotificationSideChannel);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ServiceConnectedEvent {
        public final ComponentName a;
        public final IBinder b;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    public NotificationManagerCompat(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(Notification notification, int i) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras != null && extras.getBoolean("android.support.useSideChannel")) {
            NotifyTask notifyTask = new NotifyTask(this.a.getPackageName(), i, notification);
            synchronized (f) {
                try {
                    if (g == null) {
                        g = new SideChannelManager(this.a.getApplicationContext());
                    }
                    g.b.obtainMessage(0, notifyTask).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b.cancel(null, i);
            return;
        }
        this.b.notify(null, i, notification);
    }
}
