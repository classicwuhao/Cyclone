
;this file is automatically generated: Thu May 10 19:14:51 IST 2018

;declarations generated

(declare-fun S0 () Int)
(declare-fun S1 () Int)
(declare-fun S2 () Int)
(declare-fun S3 () Int)

;formula(s) generated
(assert (and (>= S0 0) (<= S0 1)))
(assert (and (>= S1 0) (<= S1 1)))
(assert (and (>= S2 0) (<= S2 1)))
(assert (and (>= S3 0) (<= S3 1)))
(assert (= S0 0))
(assert (= S3 1))

 ;end of formula 
(assert (not (and (and (and (= S0 0) (= S1 0)) (= S2 0)) (= S3 1)) ))

(assert (not (and (and (and (= S0 0) (= S1 1)) (= S2 0)) (= S3 1)) ))

(assert (not (and (and (and (= S0 0) (= S1 0)) (= S2 1)) (= S3 1)) ))

(assert (not (and (and (and (= S0 0) (= S1 1)) (= S2 1)) (= S3 1)) ))
