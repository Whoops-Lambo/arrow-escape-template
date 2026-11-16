package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.unity.androidnotifications.UnityNotificationManager;
import com.unity3d.player.UnityPlayer;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rz2 extends tz2 {
    public uz2 a;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tz2
    public final boolean a(UnityNotificationManager unityNotificationManager, ConcurrentHashMap concurrentHashMap) {
        HashSet<String> hashSet = new HashSet();
        Enumeration enumerationKeys = concurrentHashMap.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashSet.add(String.valueOf(enumerationKeys.nextElement()));
        }
        uz2 uz2Var = this.a;
        UnityNotificationManager unityNotificationManager2 = uz2Var.c;
        boolean z = uz2Var.d >= 50;
        uz2Var.d = 0;
        if (z) {
            unityNotificationManager2.getClass();
            Log.d("UnityNotifications", "Checking for invalid notification IDs still hanging around");
            Intent intent = new Intent(unityNotificationManager2.a, (Class<?>) UnityNotificationManager.class);
            intent.setFlags(268468224);
            HashSet<String> hashSet2 = new HashSet();
            for (String str : hashSet) {
                if (PendingIntent.getBroadcast(unityNotificationManager2.a, Integer.parseInt(str), intent, 603979776) == null) {
                    hashSet2.add(str);
                }
            }
            for (StatusBarNotification statusBarNotification : unityNotificationManager2.getNotificationManager().getActiveNotifications()) {
                hashSet2.remove(String.valueOf(statusBarNotification.getId()));
            }
            Activity activity = UnityPlayer.currentActivity;
            if (activity != null) {
                Intent intent2 = activity.getIntent();
                if (intent2.hasExtra(UnityNotificationManager.KEY_NOTIFICATION_ID)) {
                    hashSet2.remove(String.valueOf(intent2.getExtras().getInt(UnityNotificationManager.KEY_NOTIFICATION_ID)));
                }
            }
            for (String str2 : hashSet2) {
                hashSet.remove(str2);
                unityNotificationManager2.f.remove(Integer.valueOf(str2));
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                unityNotificationManager2.d((String) it.next());
            }
        }
        unityNotificationManager2.p(hashSet);
        return false;
    }
}
