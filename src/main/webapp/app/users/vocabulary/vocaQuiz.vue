<template>
  <div class="vocaQuiz row">

    <!--tieu de-->
    <div class="title">
      <h1 class="display-4" v-text="$t('finalProjectApp.userVocabularyList.vocabulary.title')">Vocabulary</h1>
      <div>
        <div class="el-breadcrumb">
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/" v-text="$t('home.about.home')">Home</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/users/vocabulary" v-text="$t('finalProjectApp.userVocabularyList.vocabulary.topicList')">Vocabulary Topic List</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/users/vocabulary/vocaList" v-text="$t('finalProjectApp.userVocabularyList.vocabulary.topic01.title')">600 WORDS TOEIC</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/users/vocabulary/vocaList/vocaTopic">Contracts</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
        </div>
      </div>
    </div>

    <!-- -->
    <div class="container app">
      <div class="quiz">
        <div class="quiz-header">
          <h1>QUIZ</h1>
        </div>

        <!-- -->
        <div class="quiz-main" v-for="(question,index) in questions.slice(a,b)" :key="index" v-show="quiz">
          <div class="box-question">
            <h2>Question {{b}}/{{questions.length}}</h2>
            <p>{{question.question}}</p>
          </div>
          <div class="box-suggestions">
            <ul>
              <li
                v-for="(proposition,index) in question.propositions"
                :key="index"
                @click="selectResponse(proposition,index)"
                :class=" correct ? check(proposition) : ''"
              >
                {{proposition.props}}
                <div class="fas fa-check" v-if="correct ?  proposition.correct: ''"></div>
                <div class="fas fa-times" v-if="correct ?  !proposition.correct: ''"></div>
              </li>
            </ul>
          </div>
        </div>

        <div class="box-score" v-if="score_show">
          <h2>Your score is</h2>
          <h2>{{score}}/{{questions.length}}</h2>
          <div class="btn-restart">
            <router-link class="alert-link join" to="/users/vocabulary/vocaList/vocaTopic">
              <button @click="restartQuiz()">Restart</button>
            </router-link>
          </div>
        </div>

        <!-- -->
        <div class="quiz-footer">
          <div class="box-button" v-if="progress < 100">
            <button  @click="nextQuestion()" :style="!next ? 'background-color: rgb(106, 128, 202)' : ''">Next</button>
          </div>
        </div>
      </div>
    </div>

  </div>
</template>


<script lang="ts" src="./vocaQuiz.component.ts"></script>
<script>
export default {
  data() {
    return {
      questions: [
        {
          question:'Abide by',
          propositions: [
            {props:'(v) Ch???ng minh, gi???i th??ch',},
            {props:'(v) Tu??n th???, tu??n theo',correct:true},
            {props:'(n) S??? t??? ch???c s???p x???p',},
            {props:'(v) T???p h???p, thu th???p',},
          ]
        },
        {
          question:'Agreement',
          propositions: [
            {props:'(n) H???u qu???, k???t qu???',},
            {props:'(n) Th??ng c???m',},
            {props:'(n) S??? th???a thu???n',correct:true},
            {props:'(n) Li??n k???t, k???t h???p',},
          ]
        },
        {
          question:'Assurance',
          propositions: [
            {props:'(n) B???o ?????m, ch???c ch???n',correct:true},
            {props:'(v) Ch???ng minh, gi???i th??ch',},
            {props:'(n) Lu???t, quy t???c',},
            {props:'(v) T???ng k???t, thu th???p',},
          ]
        },
        {
          question:'Cancellation',
          propositions: [
            {props:'(n) s??? h???y b???',correct:true},
            {props:'(n) S??? ph??? bi???n',},
            {props:'(adj) ??ang th???nh h??nh, hi???n t???i',},
            {props:'(v) Thu??, m?????n',},
          ]
        },
        {
          question:'Determine',
          propositions: [
            {props:'(v) Thuy???t ph???c',},
            {props:'(v) K???t th??c, h???t hi???u l???c',},
            {props:'(v) Gi???i quy???t v???n ?????',correct:true},
            {props:'(v) X??a, lo???i b???',},
          ]
        },
        {
          question:'Engage',
          propositions: [
            {props:'(v) B???o v???',},
            {props:'(v) T??i di???n',},
            {props:'(v) b???t bu???c, ??p bu???c',},
            {props:'(v) Thu??, m?????n',correct:true},
          ]
        },
        {
          question:'Establish',
          propositions: [
            {props:'(v) T???ng k???t, thu th???p',},
            {props:'(v) Th??nh l???p',correct:true},
            {props:'(v) L???ng tr??nh, l??? ??i',},
            {props:'(v) H??m ??, n??i b??ng',},
          ]
        },
        {
          question:'Obligate',
          propositions: [
            {props:'(v) truy???n c???m h???ng',},
            {props:'(v) H???a, cam k???t',},
            {props:'(v) b???t bu???c, ??p bu???c',correct:true},
            {props:'(v) suy ra, nh???n ra',},
          ]
        },
        {
          question:'Party',
          propositions: [
            {props:'(n) S??? n???i ti???ng, danh ti???ng',},
            {props:'(n, v) ????n xin, ki???n ngh???',},
            {props:'(n) Nh??m l??m vi???c chung',correct:true},
            {props:'(n) s??? th???a m??n',},
          ]
        },
        {
          question:'Provision',
          propositions: [
            {props:'(n) S??? thuy???t ph???c',},
            {props:'(n) S??? cung c???p',correct:true},
            {props:'(n) S??? n???i ti???ng, danh ti???ng',},
            {props:'(n) D??? tr??, v???ch k??? ho???ch',},
          ]
        },
        {
          question:'Resolve',
          propositions: [
            {props:'(v) Ki??n quy???t, quy???t ?????nh',correct:true},
            {props:'(v) T??ng c?????ng, c???ng c???',},
            {props:'(v) Thay ?????i, b???t ?????ng',},
            {props:'(n, v) S??? th???c h??nh',},
          ]
        },
        {
          question:'Specify',
          propositions: [
            {props:'(v) Thay ?????i, b???t ?????ng',},
            {props:'(v) ?????nh r??, ghi r??',correct:true},
            {props:'(adj) b???ng l???i',},
            {props:'(v) S???a l???i',},
          ]
        },
      ],

      a:0,
      b:1,
      next:true,
      score_show:false,
      quiz:true,
      score:0,
      correct:false,
      progress:0,
    }
  },

  name: 'vocaQuiz',

  methods: {

    selectResponse(e) {
      this.correct = true;
      this.next = false;
      if(e.correct) {
        this.score++;
      }
    },

    check(status) {
      if(status.correct) {
        return 'correct'
      }else {
        return 'incorrect'
      }
    },

    nextQuestion() {
      if(this.next) {
        return;
      }
      this.progress = this.progress + (100/this.questions.length);
      if(this.questions.length - 1 == this.a) {
        this.score_show = true;
        this.quiz = false;
      }else {
        this.a++;
        this.b++;
        this.correct = false;
        this.next = true;
      }
    },

    skipQuestion() {
      if(!this.next) {
        return;
      }
      this.progress = this.progress + (100/this.questions.length);
      if(this.questions.length - 1 == this.a) {
        this.score_show = true;
        this.quiz = false;
      }else {
        this.a++;
        this.b++;
      }
    },

    restartQuiz() {
      Object.assign(this.$data, this.$options.data()); // reset data in vue
    },

  }
}
</script>


<style scoped>
/**/
.title {
  color: #ffffff;
  width: 100%;
  height: 150px;
  background-image: linear-gradient(to bottom right, #bb5975, #dca1b8);
  padding-top: 30px;
  padding-left: 100px;
}
.el-breadcrumb {
  padding-top: 10px;
  font-size: 14px;
  line-height: 1px;
}
.el-breadcrumb:before {
  display: table;
  content: "";
}
.item {
  color: #ffffff;
  font-weight: 700;
  text-decoration: none;
}
.item:hover {
  text-decoration: none;
  color: #ffffff;
  font-weight: 700;
}
.el-breadcrumb__separator {
  margin: 0 9px;
  font-weight: 700;
  color: #c0c4cc;
}

/**/
.app {
  display: flex;
  width: 100%;
  height: 620px;
  justify-content: center;
  position: relative;
}
.quiz {
  display: flex;
  width: 100%;
  height: 90%;
  position: absolute;
  top: 20px;
  bottom: 0;
  margin: auto;
  flex-flow: column;
  text-align: center;
  border: 1px solid #e7eae0;
  border-radius: 10px;
  background-color: #ffffff;
  box-shadow: 0 10px 20px rgba(0, 0, 0, 0.19), 0 6px 6px rgba(0, 0, 0, 0.23);
}
.quiz-header {
  display: flex;
  width: 100%;
  height: 20%;
  border-bottom: 1px solid #e7eae0;
  justify-content: center;
  align-items: center;
  background-color: #90bce7;
  border-radius: 10px 10px 0 0;
}
.quiz-header h1 {
}
.quiz-main {
  display: flex;
  width: 100%;
  height: 70%;
  flex-flow: column;
  margin: auto;
}

.box-question {
  margin-top: 20px;
}
.box-question p {
  font-size: 20px;
  text-transform: uppercase;
}

.box-suggestions {
  display: flex;
  width: 100%;
  justify-content: center;
  margin: auto;
}

ul {
  display: flex;
  width: 80%;
  margin: 0;
  padding: 0;
  flex-flow: column;
}
ul li {
  list-style: none;
  line-height: 2;
  border: 1px solid #bb5975;
  margin-bottom: 20px;
  border-radius: 15px;
  cursor: pointer;
}
ul li:hover {
  background-color: #de89a3;
  /*color: #ffffff;*/
}

li.correct {
  border: 1px solid rgb(22, 50, 115);
  background-color: rgb(22, 50, 115);
  color: white;
  font-weight: 600;
}

li.incorrect {
  border: 1px solid rgb(177, 145, 234);
  background-color: rgb(177, 145, 234);
  color: white;
  font-weight: 600;
}
.box-score {
  display: flex;
  width: 100%;
  height: 70%;
  flex-flow: column;
}

.box-score h2 {
  margin-top: 40px;
}

/*i {*/
/*  display: none;*/
/*  color: white;*/
/*}*/

.step-progress {
  display: flex;
  width: 100%;
  height: 5px;
  background-color: rgb(106, 128, 202);
  transition: 0.5s;
}

.btn-restart {
  display: flex;
  width: 100%;
  height: auto;
  justify-content: center;
  margin-top: 50px;
}

.btn-restart button {
  width: 150px;
  height: 35px;
  outline: none;
  border: 0;
  background-color: rgb(106, 128, 202);
  color: white;
  font-size: 18px;
  cursor: pointer;
  border-radius: 15px;
  margin: auto;
  margin-bottom: 10px;
  letter-spacing: 2px;
}

/*.next {*/
/*  background-color: rgb(106, 128, 202);*/
/*}*/

.quiz-footer {
  display: flex;
  width: 100%;
  height: 10%;
  justify-content: center;
  border-top: 1px solid #e7eae0;
  background-color: #90bce7;
  border-radius: 0 0 10px 10px;
}

.box-button {;
  width: 200px;
}

.box-button button {
  width: 100%;
  height: 35px;
  border-radius: 20px;
  background-image: linear-gradient(to bottom right, #bb5975, #dca1b8);
  margin-top: 10px;
  color: #ffffff;
}

</style>
