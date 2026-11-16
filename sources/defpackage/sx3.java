package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbft;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class sx3 implements Application.ActivityLifecycleCallbacks {
    public final Application b;
    public final WeakReference c;
    public final /* synthetic */ int a = 0;
    public boolean d = false;

    public sx3(Application application, zzbft zzbftVar) {
        this.c = new WeakReference(zzbftVar);
        this.b = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    public sx3(Application application, zzbcy zzbcyVar) {
        this.c = new WeakReference(zzbcyVar);
        this.b = application;
    }
}
