/*
 * The WhiteText project
 * 
 * Copyright (c) 2012 University of British Columbia
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package ubic.pubmedgate.mallet.features;

import java.util.HashSet;
import java.util.Set;

import ubic.pubmedgate.metaMap.MakeMMTxAnnotations;

public class MMTxFeatures extends GATEAnnotationInWithFeatures {
    Set<String> featurePrefix;

    public MMTxFeatures() {
        super( MakeMMTxAnnotations.ANNOTATIONSET, MakeMMTxAnnotations.ANNOTATIONNAME );
        featurePrefix = new HashSet<String>();
//         featurePrefix.add( "MMTxCUI=" );
//         featurePrefix.add( "MMTxScore=" );
//         featurePrefix.add( "MMTxSemType=" );
//         featurePrefix.add( "MMTxSource=" );
         featurePrefix.add( "MMTxPhraseType=" );
         itselfIsFeature = false;
    }

    public boolean acceptFeature( String key ) {
        for ( String prefix : featurePrefix ) {
            if ( key.startsWith( prefix ) ) return true;
        }
        return false;
    }
}
