
;this file is automatically generated: Fri Jan 15 16:54:49 CST 2021

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
(assert (and (and (and (and (or (and (= T0 0) (= T1 0)) (and (= T0 0) (= T1 1))) (or (or (and (= T1 0) (= T2 0)) (and (= T1 0) (= T2 1))) (and (= T1 1) (= T2 0)))) (or (and (= T2 0) (= T3 0)) (and (= T2 0) (= T3 1)))) (or (or (and (= T3 0) (= T4 0)) (and (= T3 0) (= T4 1))) (and (= T3 1) (= T4 0)))) (or (and (= T4 0) (= T5 0)) (and (= T4 0) (= T5 1)))))
(assert (= T5 1))

 ;end of formula 
(assert (not (and (and (and (and (and (= T0 0) (= T1 0)) (= T2 0)) (= T3 0)) (= T4 0)) (= T5 1)) ))

(assert (not (and (and (and (and (and (= T0 0) (= T1 1)) (= T2 0)) (= T3 0)) (= T4 0)) (= T5 1)) ))

(assert (not (and (and (and (and (and (= T0 0) (= T1 0)) (= T2 0)) (= T3 1)) (= T4 0)) (= T5 1)) ))

(assert (not (and (and (and (and (and (= T0 0) (= T1 1)) (= T2 0)) (= T3 1)) (= T4 0)) (= T5 1)) ))
