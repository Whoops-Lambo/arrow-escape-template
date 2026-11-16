package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import defpackage.vq2;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RequiresApi
public class AppComponentFactory extends android.app.AppComponentFactory {
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (Activity) CoreComponentFactory.a((Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            vq2.n("Couldn't call constructor", e);
            return null;
        }
    }

    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        try {
            return (Application) CoreComponentFactory.a((Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            vq2.n("Couldn't call constructor", e);
            return null;
        }
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        try {
            return (ContentProvider) CoreComponentFactory.a((ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            vq2.n("Couldn't call constructor", e);
            return null;
        }
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (BroadcastReceiver) CoreComponentFactory.a((BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            vq2.n("Couldn't call constructor", e);
            return null;
        }
    }

    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (Service) CoreComponentFactory.a((Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            vq2.n("Couldn't call constructor", e);
            return null;
        }
    }
}
