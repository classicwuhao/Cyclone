
;this file is automatically generated: Sun Aug 23 18:48:07 CST 2020

;declarations generated

(declare-fun T0 () Int)
(declare-fun T1 () Int)
(declare-fun T2 () Int)
(declare-fun T3 () Int)
(declare-fun T4 () Int)
(declare-fun T5 () Int)

;formula(s) generated
(assert (and (>= T0 0) (<= T0 2)))
(assert (and (>= T1 0) (<= T1 2)))
(assert (and (>= T2 0) (<= T2 2)))
(assert (and (>= T3 0) (<= T3 2)))
(assert (and (>= T4 0) (<= T4 2)))
(assert (and (>= T5 0) (<= T5 2)))
(assert (and (and (and (and (and (= T0 0) (= T1 1)) (or (and (= T1 1) (= T2 0)) (and (= T1 1) (= T2 2)))) (or (and (= T2 0) (= T3 1)) (and (= T2 2) (= T3 1)))) (or (and (= T3 1) (= T4 0)) (and (= T3 1) (= T4 2)))) (or (and (= T4 0) (= T5 1)) (and (= T4 2) (= T5 1)))))
(assert (= T5 1))
(assert (or (or (or (or (or (= T0 1) (= T1 1)) (= T2 1)) (= T3 1)) (= T4 1)) (= T5 1)))
(assert (or (or (or (and (and (= T0 2) (= T1 1)) (= T2 2)) (and (and (= T1 2) (= T2 1)) (= T3 2))) (and (and (= T2 2) (= T3 1)) (= T4 2))) (and (and (= T3 2) (= T4 1)) (= T5 2))))

 ;end of formula 