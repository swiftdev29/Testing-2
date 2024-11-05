package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    final Object f83a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f84b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f85c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f86d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f87a;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f87a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f83a) {
                    mediaControllerCompat$MediaControllerImplApi21.f86d.c(b.a.v0(k.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f86d.d(t1.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    private static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        public void J(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        public void S(Bundle bundle) {
            throw new AssertionError();
        }

        public void k(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        public void p0(CharSequence charSequence) {
            throw new AssertionError();
        }

        public void u() {
            throw new AssertionError();
        }

        public void w(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f86d.a() != null) {
            for (c next : this.f84b) {
                a aVar = new a(next);
                this.f85c.put(next, aVar);
                next.f119b = aVar;
                try {
                    this.f86d.a().K(aVar);
                    next.i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            this.f84b.clear();
        }
    }
}
