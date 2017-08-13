/*
 * Copyright 2016 Manas Chaudhari
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.manaschaudhari.android_mvvm.sample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;

import com.manaschaudhari.android_mvvm.ViewModel;
import com.manaschaudhari.android_mvvm.sample.model.SecretTeller;
import com.manaschaudhari.android_mvvm.sample.model.SecretTellersManager;

import java.util.List;


public class MainViewModel extends BaseObservable implements ViewModel {
    @NonNull
    private final Navigator navigator;
    private List<SecretTeller> secretTellers;

    private SecretTellersManager secretTellersManager;

    public MainViewModel(@NonNull Navigator navigator) {

        this.navigator = navigator;


        secretTellersManager = new SecretTellersManager();


        setSecretTellers(secretTellersManager.getSecretTellers());

    }

    @Bindable
    public List<SecretTeller> getSecretTellers(){
        return secretTellers;
    }

    private void setSecretTellers(List<SecretTeller> secretTellers){
        this.secretTellers = secretTellers;
        notifyPropertyChanged(BR.secretTellers);
    }







//    public final Action onAdapterClick = new Action() {
//        @Override
//        public void run() throws Exception {
//            navigator.navigateToAdapterDemo();
//        }
//    };
//
//    public final Action onFunctionalClick = new Action() {
//        @Override
//        public void run() throws Exception {
//            navigator.navigateToFunctionalDemo();
//        }
//    };
//
//    public final Action onTwoWayBindingClick = new Action() {
//        @Override
//        public void run() throws Exception {
//            navigator.navigateToTwoWayBindingDemo();
//        }
//    };
//
//    public final Action onCalculatorExampleClick = new Action() {
//        @Override
//        public void run() throws Exception {
//            navigator.navigateToCalculatorDemo();
//        }
//    };
}
