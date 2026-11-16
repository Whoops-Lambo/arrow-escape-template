package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.gd1;
import defpackage.hf3;
import defpackage.p32;
import defpackage.pp1;
import defpackage.pv1;
import defpackage.wz2;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.mc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4213mc implements LocationListener {
    public static final C4213mc a = new C4213mc();
    public static final LocationManager b;
    public static final HandlerThread c;
    public static GoogleApiClient d;
    public static final String e;
    public static boolean f;
    public static final Mutex g;

    public static boolean d() {
        try {
            return Og.a(AbstractC4221mk.a, "android.permission.ACCESS_FINE_LOCATION") || Og.a(AbstractC4221mk.a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            e.getClass();
            return false;
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        c = handlerThread;
        e = "mc";
        g = new pp1();
        AbstractC4097i7.a(handlerThread, "LThread");
        Context context = AbstractC4221mk.a;
        if (context != null) {
            Object systemService = context.getSystemService("location");
            b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static HashMap a(Location location, boolean z, Location location2) {
        HashMap map = new HashMap();
        Context context = AbstractC4221mk.a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    map.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                map.put("u-latlong-accu", a(location));
                map.put("sdk-collected", Integer.valueOf(z ? 1 : 0));
            }
            Oi oi = Jk.a;
            Context context2 = AbstractC4221mk.a;
            String string = null;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                string = Cb.a(context2, "coppa_store").a.getString("im_accid", null);
            }
            if (string == null || Jk.a().getLocationEnabled()) {
                map.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                map.put("u-latlong-accu-fine", a(location2));
                map.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (!e() || !d()) {
                map.put("loc-granularity", "none");
                return map;
            }
            if (Og.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                map.put("loc-granularity", "coarse");
            }
        }
        return map;
    }

    public static Location c() {
        try {
            Context context = AbstractC4221mk.a;
            context.getClass();
            Task lastLocation = new FusedLocationProviderClient(context, LocationServices.a, Api.ApiOptions.NO_OPTIONS, new ApiExceptionMapper()).getLastLocation();
            lastLocation.getClass();
            return (Location) lastLocation.getResult();
        } catch (Exception unused) {
            return null;
        } catch (IncompatibleClassChangeError e2) {
            e.getClass();
            e2.toString();
            return null;
        }
    }

    public static boolean e() {
        int i;
        Context context = AbstractC4221mk.a;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    i = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
                } catch (Settings.SettingNotFoundException unused) {
                    i = 0;
                }
                return i != 0;
            }
            LocationManager locationManager = b;
            if (locationManager != null && locationManager.isLocationEnabled()) {
                return true;
            }
        }
        return false;
    }

    public static boolean f() {
        try {
            p32.a(GoogleApiClient.class).getSimpleName();
            p32.a(FusedLocationProviderClient.class).getSimpleName();
            p32.a(LocationServices.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void b() {
        LocationManager locationManager = b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider == null) {
                e.getClass();
            } else {
                e.getClass();
                locationManager.requestSingleUpdate(bestProvider, this, c.getLooper());
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        location.getClass();
        try {
            e.getClass();
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (d() && (locationManager = b) != null) {
                locationManager.removeUpdates(this);
            }
        } catch (Exception e2) {
            gd1 gd1Var = Ba.a;
            U9.a(e2);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        str.getClass();
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        str.getClass();
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = d;
            if (googleApiClient == null) {
                e.getClass();
                context.getClass();
                GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C4157kc()).addOnConnectionFailedListener(new hf3()).addApi(LocationServices.a).build();
                d = googleApiClientBuild;
                if (googleApiClientBuild != null) {
                    googleApiClientBuild.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception e2) {
            e.getClass();
            e2.getMessage();
        }
    }

    public static final void a(ConnectionResult connectionResult) {
        connectionResult.getClass();
        f = false;
    }

    public static Location a() {
        Location location;
        Location locationC;
        Location locationA;
        try {
            if (e() && d()) {
                locationC = f ? c() : null;
                try {
                    locationA = (b == null || !Og.a(AbstractC4221mk.a, "android.permission.ACCESS_COARSE_LOCATION")) ? null : a(2, 2);
                } catch (Exception e2) {
                    location = locationC;
                    e = e2;
                    e.getClass();
                    e.getMessage();
                    locationC = location;
                }
            } else {
                locationC = null;
                locationA = null;
            }
        } catch (Exception e3) {
            e = e3;
            location = null;
        }
        if (locationC == null && locationA == null) {
            e.getClass();
            return null;
        }
        return a(locationC, locationA);
    }

    public static Location a(Location location, Location location2) {
        if (location == null) {
            e.getClass();
            if (location2 != null) {
                location2.getTime();
            }
            Objects.toString(location2);
            return location2;
        }
        if (location2 == null) {
            e.getClass();
            location.getTime();
            location.toString();
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            e.getClass();
            location.getTime();
            location.toString();
            return location;
        }
        if (z2) {
            e.getClass();
            location2.getTime();
            location2.toString();
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        if (!z5 && (!z3 || (z4 && z6))) {
            e.getClass();
            location2.getTime();
            location2.toString();
            return location2;
        }
        e.getClass();
        location.getTime();
        location.toString();
        return location;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[DONT_INVERT, PHI: r1
  0x0052: PHI (r1v4 android.location.Location) = 
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v5 android.location.Location)
 binds: [B:31:0x0052, B:17:0x0042, B:19:0x0048, B:22:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055 A[LOOP:0: B:15:0x0038->B:26:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0058 A[EDGE_INSN: B:38:0x0058->B:28:0x0058 BREAK  A[LOOP:0: B:15:0x0038->B:26:0x0055], SYNTHETIC] */
    public static Location a(int i, int i2) {
        String bestProvider;
        Location lastKnownLocation;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i);
        criteria.setPowerRequirement(i2);
        criteria.setCostAllowed(false);
        LocationManager locationManager = b;
        Location lastKnownLocation2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
            } catch (Exception unused) {
                lastKnownLocation = null;
            }
            if (lastKnownLocation != null || i == 1) {
                lastKnownLocation2 = lastKnownLocation;
            } else {
                LocationManager locationManager2 = b;
                if (locationManager2 != null) {
                    List<String> providers = locationManager2.getProviders(true);
                    providers.getClass();
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            String str = providers.get(size);
                            try {
                                LocationManager locationManager3 = b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        lastKnownLocation2 = locationManager3.getLastKnownLocation(str);
                                    } catch (SecurityException unused2) {
                                    }
                                    if (lastKnownLocation2 != null) {
                                        break;
                                    }
                                    if (i3 < 0) {
                                        break;
                                        break;
                                    }
                                    size = i3;
                                } else {
                                    if (i3 < 0) {
                                        break;
                                    }
                                    size = i3;
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
        }
        e.getClass();
        return lastKnownLocation2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        C4185lc c4185lc;
        pp1 pp1Var;
        Mutex mutex;
        if (fyVar instanceof C4185lc) {
            c4185lc = (C4185lc) fyVar;
            int i = c4185lc.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4185lc.d = i - Integer.MIN_VALUE;
            } else {
                c4185lc = new C4185lc(this, fyVar);
            }
        } else {
            c4185lc = new C4185lc(this, fyVar);
        }
        Object obj = c4185lc.b;
        int i2 = c4185lc.d;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = g;
            c4185lc.a = mutex2;
            c4185lc.d = 1;
            pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(c4185lc);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                mutex = pp1Var;
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex3 = c4185lc.a;
            wz2.a0(obj);
            mutex = mutex3;
        }
        try {
            try {
                mutex = pp1Var;
                C4213mc c4213mc = a;
                if (d() && e()) {
                    c4213mc.b();
                    if (!f()) {
                        a(AbstractC4221mk.a);
                    }
                }
            } catch (Exception e2) {
                e.getClass();
                e2.getMessage();
            }
            return az2.a;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    public static String a(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        int accuracy = (int) location.getAccuracy();
        StringBuilder sb = new StringBuilder();
        sb.append(latitude);
        sb.append(",");
        sb.append(longitude);
        return pv1.l(accuracy, ",", sb);
    }
}
