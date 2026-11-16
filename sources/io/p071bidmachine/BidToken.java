package io.p071bidmachine;

import androidx.annotation.NonNull;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class BidToken implements ExpirationHandler.Listener {

    @NonNull
    private final AdRequest<?, ?, ?> adRequest;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final ExpirationListener<BidToken> expirationListener;

    @NonNull
    private final String id = UUID.randomUUID().toString();

    public void destroyAdRequest() {
        this.adRequest.clearNetworkAdUnits();
        this.adRequest.destroy();
    }

    @NonNull
    public AdRequest<?, ?, ?> getAdRequest() {
        return this.adRequest;
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.expirationListener.onExpired(this);
    }

    public void startExpiration() {
        this.expirationHandler.start();
    }

    public void stopExpiration() {
        this.expirationHandler.stop();
    }

    public BidToken(@NonNull AdRequest<?, ?, ?> adRequest, int i, @NonNull ExpirationListener<BidToken> expirationListener) {
        this.adRequest = adRequest;
        this.expirationHandler = new ExpirationHandler(TimeUnit.SECONDS.toMillis(i), this, new j0());
        this.expirationListener = expirationListener;
    }
}
