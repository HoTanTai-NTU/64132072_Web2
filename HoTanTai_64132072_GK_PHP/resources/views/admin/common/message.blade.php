@if (Session::has('error'))
<div class="alert alert-danger" role="alert">
    <b>Error!</b> {{Session::get('error')}}
</div>
@endif

@if (Session::has('success'))
<div class="alert alert-success" role="alert">
    <b>Success!</b> {{Session::get('success')}}
</div>    
@endif
