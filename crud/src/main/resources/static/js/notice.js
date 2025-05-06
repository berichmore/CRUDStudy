

//페이지 로드
$(document).ready(function (){
    //jQuery에서 사용하는 대표적인 초기 실행 구문
    //HTML 문서가 완전히 로드되고, DOM(Document Object Model)이 생성된 이후에 이 함수를 실행하라
    // 왜 쓰나? 브라우저가 HTML을 아직 다 읽기 전에 자바스크립트가 실행되면,
    // <div>,<ul>,<input> 등 요소를 찾을 수 없거나
    // DOM 조작이나 이벤트 바인딩이 오류 발생할 수 있음
    // 그래서 DOM이 완전히 준비된 후 실행되도록 보장하는게 '$(document).ready(...)'
    const path = window.location.pathname;
                    // window : 브라우저 창 전체를 의미하는 전역객체.
                    // location : 현재 페이지의 URL 정보가 들어 있음
                    // pathname : /부터 시작하는 경로부분만 가져옴
    const parts = path.split('/');

    // const parts = path.split('/'); 란?
    // path를 '/' 기준으로 나눠서 배열로 만드는 코드
    // 예시를 들어보자
    // const path = "/notice/123";
    // const parts = path.split('/');
    // console.log(parts);
    // 이러면 출력 결과는
    // ["","notice","123"] 으로 나옴 ( /를 기준으로 배열로 만드는 코드니까)

    // 그렇다면
    // .split('/')은 무슨 뜻일까?
    // split(separator)는 문자열을 특정 기준(separator)으로 잘라서 배열로 바꾸는 함수이다
    // 여기서 '/'를 기준으로 자르니까 /notice/123 이 다음처럼 잘림

    // "" -> 첫 번째 '/' 앞 (비어 있음)
    // "notice" -> 첫 번째 경로
    // "123" -> 두 번째 경로

    // 왜 이렇게 쓰는 건가?
    // 이렇게 자른 이유는  -> 경로의 특정 위치 값을 확ㅇ니하거나 조건 처리하려고
    // if(parts[1] === "notice" && !isNaN(parts[2])){
    //     getNoticeDetail(parts[2]); // "123"을 파라미터로 넘김
    // }
    // parts[1]  -> notice
    // parts[2] -> 게시글 번호(예: 123)
    // 을 뽑아서, 현재 URL이 /notice/글번호  형식이면 -> 상세보기 함수 실행.


})


/***************************************/